package com.lc.jvmstudy.classloading;

/**
 * @description:
 * @author: lc
 * @date: 2020-03-13 20:55
 *  常量在编译阶段会存入到调用这个常量的方法所在的类的常量池中，
 *  本质上，调用类并没有直接引用到定义常量的类，因此并不会触发定义常量的类的初始化
 *  注意：这里指的是将常量存放到了MyTest2的常量池中，之后MyTest2的MyParent2就没有任何关系了，甚至，我们可以将Myparent2的Class文件删除
 *  javap -c 反编译
 *  助记符：
 *  ldc表示将int,float或是String类型额常量值从常量池中推送至栈顶
 *  bipush表示将字节（-128-127）的常量值推送至栈顶
 *  sipush表示讲一个短整型的常量值（-32768 - 32767）推送至栈顶
 *  ICONST_1 把int类型1推送至栈顶（iconst_m1 - iconst_5）-1 到 5
 **/

public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.instance);
    }
}
class MyParent2{
    //eg1:
    //public static String str = "hello world";

    public static final String str = "hello world";

    public static final MyParent2 instance = new MyParent2();

    public static MyParent2 getInstance(){
        return MyParent2Inner.instance2;
    }

    private MyParent2(){

    }
    static {
        System.out.println("MyParent2 static block");
    }

    private static class MyParent2Inner{
        private static final MyParent2 instance2 = new MyParent2();

        static {
            System.out.println("MyParent2Inner static block");
        }
    }
}
