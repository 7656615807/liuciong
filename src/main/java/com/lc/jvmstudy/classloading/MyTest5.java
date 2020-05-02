package com.lc.jvmstudy.classloading;

import java.util.Random;

/**
 * @description:
 * @author: lc
 * @date: 2020-04-11 14:39
 * 当一个接口在初始化时，并不要求其父接口都完成了初始化
 * 只有在真正使用到父接口的时候，（如引用接口中所定义的常量时）才会初始化
 **/

public class MyTest5 {
    public static void main(String[] args) {
        new C();
        System.out.println(MyChild5.B);
        System.out.println(MyGranda2.thread);
    }
}

//interface MyParent5{
interface MyGranda{

    public static Thread thread = new Thread(){
        {
            System.out.println("MyGranda invoked");
        }
    };
}

//interface MyParent5{
class MyParent5 implements MyGranda{
    //eg1,2:public static int A = 5;
    //eg3:
    public static int A = new Random().nextInt(2);

    //eg3:
    public static Thread thread = new Thread(){
        {
            System.out.println("MyParent5 invoked");
        }
    };
}
//interface MyChild5 extends MyParent5{
class MyChild5 extends MyParent5{
    //eg1: public static int B = 6;
    //eg2: public static final int B = new Random().nextInt(2);
    public static int B = 5;

}

class C {
    {
        System.out.println("hello");
    }
    public C(){
        System.out.println("C");
    }
}

interface MyGranda1{

    public static Thread thread = new Thread(){
        {
            System.out.println("MyGranda1 invoked");
        }
    };
}

interface MyGranda2 extends MyGranda1{

    public static Thread thread = new Thread(){
        {
            System.out.println("MyGranda2 invoked");
        }
    };
}