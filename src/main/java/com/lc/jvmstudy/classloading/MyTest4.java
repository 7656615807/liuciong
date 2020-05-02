package com.lc.jvmstudy.classloading;

/**
 * @description:
 * @author: lc
 * @date: 2020-04-11 12:27
 * 对于数组实例来说，其类型是由jvm运行期间动态生成的，表示为[Lcom.lc.jvmstudy.classloading.类名
 * 对于数组来说，JavaDoc经常将构成数组的元素为Component,实际上就是将数组降低一个维度后的类型
 * anewarray: 表示创建一个引用类型的（如类，接口，数据）数组，并将其引用值压入栈顶
 * newarray：表示创建一个指定的原始类型（int，char， float）数组，并将其引用值压入栈顶
 **/

public class MyTest4 {
    public static void main(String[] args) {
        //eg1:
        /*MyParent4 myParent4 = new MyParent4();
        System.out.println("=====");
        MyParent4 myParent5 = new MyParent4();*/

        //eg2:
        /*MyParent4 myParent4s []= new MyParent4[1];
        System.out.println(myParent4s.getClass());
        MyParent4 myParent4ss [][]= new MyParent4[1][1];
        System.out.println(myParent4ss.getClass());
        System.out.println(myParent4ss.getClass().getSuperclass());*/

        int [] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

    }
}

class MyParent4{
    static{
        System.out.println("MyParent4 static block");
    }
}