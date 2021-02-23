package com.Example;

import java.util.Arrays;

class Teacher {

    public String name;
    public int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

}


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



    }



}
