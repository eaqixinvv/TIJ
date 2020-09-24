//:Object/Exercise1.java
package com.eaqixinvv.chapter2.exercise;

/**
 * Create a class containing an int and a char that are not initialized
 * and print their values that Java performs default initialization
 * @author: eaqixinvv
 * @author: eaqixinvv@outlook.com
 * @create: 2020-09-23 13:41
 **/
public class Exercise1 {
    int i ;
    char c ;

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        System.out.println("the int value is :"+exercise1.i+".");
        // char的初始值立为\u0000（null 空字符)
        System.out.println("the char value is :"+exercise1.c+".");
    }
}/*
    Output
        the int value is 0.
        the char value is  .
*///:~
