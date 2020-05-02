package com.lc.jvmstudy.classloading;

/**
 * @description:
 * @author: lc
 * @date: 2020-04-11 15:03
 **/

public class MyTest6 {
    public static void main(String[] args) {
        SingLeton singLeton = SingLeton.getSingLeton();
        System.out.println("counter1: " +SingLeton.counter1);
        System.out.println("counter2: " +SingLeton.counter2);
    }
}

class SingLeton{
    public static int counter1 ;
    //eg1: public static  int counter2 = 0;
    private static SingLeton singLeton = new SingLeton();
    private SingLeton(){
        counter1 ++ ;
        counter2 ++;
        System.out.println(counter1);
        System.out.println(counter2);
    }
    //eg2:
    public static  int counter2 = 0;

    public static SingLeton getSingLeton(){
        return singLeton;
    }
}
