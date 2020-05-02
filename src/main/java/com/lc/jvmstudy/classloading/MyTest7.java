package com.lc.jvmstudy.classloading;

/**
 * @description:
 * @author: lc
 * @date: 2020-04-12 17:26
 **/

public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> class1 = Class.forName("java.lang.String");
        System.out.println(class1.getClassLoader());

        Class class2 = Class.forName("com.lc.jvmstudy.classloading.CS");
        System.out.println(class2.getClassLoader());
    }
}

class CS{

}