package com.lc.jvmstudy.classloading;

import java.util.UUID;

/**
 * @description:
 * @author: lc
 * @date: 2020-04-11 12:17
 * 当一个常量的值并非编译期间可以确定的，那么其值就不会被放到调用类的常量池中，
 * 这是在程序运行时，会导致主动使用这个常量所在的类，就会导致类初始化
 **/

public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}

class MyParent3{
    public static final String str = UUID.randomUUID().toString();
    static {
        System.out.println("MyParent3 static code");
    }
}