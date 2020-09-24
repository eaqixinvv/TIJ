//:Object/Exercise8.java
package com.eaqixinvv.chapter2.exercise;

/**
 * Write a program to demonstrate that no matter
 * how many objects you create of a particular class .
 * there is only one instance of a particular static
 * field in that class
 *
 * @author eaqixinvv
 * @create 2020-09-23 14:56
 **/
public class Exercise8 {

    static  int i ;

    public static void main(String[] args) {
        Exercise8 a = new Exercise8();
        Exercise8 b = new Exercise8();
        System.out.println("a.i="+a.i+",b.i="+b.i+",a==b:"+(a.i == b.i));
        a.i ++;
        System.out.println("a.i="+a.i+",b.i="+b.i+",a==b:"+(a.i == b.i));
        b.i++;
        System.out.println("a.i="+a.i+",b.i="+b.i+",a==b:"+(a.i == b.i));
        Exercise8.i++;
        System.out.println("a.i="+a.i+",b.i="+b.i+",a==b:"+(a.i == b.i));
    }
}/*
    Output
        a.i=0,b.i=0,a==b:true
        a.i=1,b.i=1,a==b:true
        a.i=2,b.i=2,a==b:true
        a.i=3,b.i=3,a==b:true
*///:~
