package com.lc.jvmstudy.classloading;

/**
 * @description:
 * @author: lc
 * @date: 2020-04-12 17:37
 **/

public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x );
    }
}

class FinalTest{
    public static final int x = 3;
    static {
        System.out.println("FinalTest static block");
    }
}
