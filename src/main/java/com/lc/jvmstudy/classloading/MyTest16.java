package com.lc.jvmstudy.classloading;

import java.io.*;

/**
 * @description:
 * @author: lc
 * @date: 2020-05-02 22:10
 **/

public class MyTest16 extends ClassLoader {
    private String classLoaderName;

    private final String fileExtension = ".class";

    public MyTest16(String classLoaderName){
        super();//将系统类加载器当做改类加载器的父类加载器
        this.classLoaderName = classLoaderName;
    }
    public MyTest16(String classLoaderName, ClassLoader parentClassLoader){
        super(parentClassLoader);//显示的指定该类的父类加载器
        this.classLoaderName = classLoaderName;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte [] data = loadClassData(name);
        return this.defineClass(name, data, 0 , data.length);
    }

    private byte [] loadClassData(String name){
        InputStream in = null;
        byte [] data = null;
        ByteArrayOutputStream outputStream = null;
        try {
            this.classLoaderName = this.classLoaderName.replace(".","/");
            in = new FileInputStream(new File(name + this.fileExtension));
            outputStream = new ByteArrayOutputStream();
            int ch = 0;
            while (-1 != (ch = in.read())){
                outputStream.write(ch);
            }
            data = outputStream.toByteArray();
        }catch (Exception e){
            e.printStackTrace();
        }
        return data;
    }

    public static void test(ClassLoader classLoader) throws Exception {
        Class<?> clazz = classLoader.loadClass("com.lc.jvmstudy.classloading.MyTest14");
        Object myTest14 = clazz.newInstance();
        System.out.println(myTest14);
        System.out.println(myTest14.getClass().getClassLoader());
    }

    public static void main(String[] args) throws Exception {
        MyTest16 myTest16 = new MyTest16("loader1");
        test(myTest16);
    }
}
