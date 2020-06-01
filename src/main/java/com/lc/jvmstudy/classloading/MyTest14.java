package com.lc.jvmstudy.classloading;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @description:
 * @author: lc
 * @date: 2020-05-02 20:32
 **/

public class MyTest14 {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        String resoutceName = "com/lc/jvmstudy/classloading/MyTest13.class";
        Enumeration<URL> urls = classLoader.getResources(resoutceName);
        while (urls.hasMoreElements()){
            URL url = urls.nextElement();
            System.out.println(url);
        }
        System.out.println("---------------");
        Class<?> clazz = MyTest14.class;
        System.out.println(clazz.getClassLoader());
    }
}
