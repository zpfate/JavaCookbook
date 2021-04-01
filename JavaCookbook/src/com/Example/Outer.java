package com.Example;

public class Outer {

    private String name;

    Outer(String name) {
        this.name = name;
    }

    /// 内部类 与普通类有个最大的不同，就是Inner Class的实例不能单独存在，必须依附于一个Outer Class的实例
    class Inner {
        void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
    }


    // 匿名类   在方法内部实例化了一个Runnable。
    // Runnable本身是接口，接口是不能实例化的，所以这里实际上是定义了一个实现了Runnable接口的匿名类，
    // 并且通过new实例化该匿名类，然后转型为Runnable。
    void asyncHello() {
        Runnable runnable = new Runnable(){
          @Override
          public void run() {
              System.out.println("Hello, " + Outer.this.name);
          }
        };
    }
}
