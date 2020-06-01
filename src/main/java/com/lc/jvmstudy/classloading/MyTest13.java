package com.lc.jvmstudy.classloading;

/**
 * @description:
 * @author: lc
 * @date: 2020-05-02 20:29
 **/

public class MyTest13 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        while (classLoader != null){
            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }
    }
}
