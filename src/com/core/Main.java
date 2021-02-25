package com.core;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {


        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        /// 两个字符串用==和equals()比较都为true，但实际上那只是Java编译器在编译期，
        /// 会自动把所有相同的字符串当作一个对象放入常量池，自然s1和s2的引用就是相同的。
        /// 所以，这种==比较返回true纯属巧合。换一种写法，==比较就会失败：

        String s3 = "hello";
        String s4 = "HELLO".toLowerCase();
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        /// 搜索子串
        String s = "hello";
        s.indexOf("l");
        s.lastIndexOf("l");
        s.startsWith("he");
        s.endsWith("o");

        /// 提取子串的例子
        s.substring(2);
        s.substring(2,4);

        /// 去除首尾空白字符串 空白字符包括空格，\t，\r，\n
        /// trim不改变原有字符串的内容，而是返回了一个新串
        "\tHello\r\n".trim(); // Hello


        String ss = "A,B,C,D";
        String[] arr = ss.split(",");
        System.out.println("arr = " + Arrays.toString(arr));







    }

}
