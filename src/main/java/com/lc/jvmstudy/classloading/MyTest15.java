package com.lc.jvmstudy.classloading;

/**
 * @description:
 * @author: lc
 * @date: 2020-05-02 21:32
 **/

public class MyTest15 {
    public static void main(String[] args) {
        String[] strings = new String[2];
        System.out.println(strings.getClass().getClassLoader());

        System.out.println("-----------");
        int [] ins = new int[20];
        System.out.println(ins.getClass().getClassLoader());

        MyTest15 myTest15 [] = new MyTest15[2];
        System.out.println(myTest15.getClass());
        System.out.println(myTest15.getClass().getClassLoader());
    }
}
