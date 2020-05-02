package com.lc.jvmstudy.classloading;

/**
 * @description:
 * @author: lc
 * @date: 2020-03-13 20:17
 **/

public class Test1 {
    public static void main(String[] args) {
        //eg1:
        //System.out.println(MyChild.str);

        //eg2:
        System.out.println(MyChild.str2);

    }
}

class MyParent1{
    public static String str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild extends MyParent1{
    public static String str2 = "hello world";

    static {
        System.out.println("MyChild static block");
    }
}
