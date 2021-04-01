package com.Example;

import java.util.Arrays;


public class Main {

    public static  void main(String[] args) {
        System.out.println("Hello World");

        int x = 100;
        System.out.println("x = " + x);

        /*
        byte 1个字节
        short char 2个字节
        int float 4个字节
        long double 8个字节
         */


        /// 运算溢出
        int a = 2147483640;
        int b = 15;
        int sum = a + b;
        System.out.println(sum);

        /// 数组
        int[] ns = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ns));

        Teacher t = new Teacher("name", 12);
        String bob = "Bob";
        t.name = bob;
        bob = "Alice";
        System.out.println(t.name);

        ///

        Outer outer = new Outer("Nested"); // 实例化一个Outer
        Outer.Inner inner = outer.new Inner(); // 实例化一个Inner
        inner.hello();


    }



}
