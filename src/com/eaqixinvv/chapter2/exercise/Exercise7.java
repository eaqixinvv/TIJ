//:Object/Exercise7
package com.eaqixinvv.chapter2.exercise;

/**
 * Turn the Incrementable code fragments into a working program
 * @author eaqixinvv
 * @create 2020-09-23 14:47
 **/
public class Exercise7 {
    static int i = 47 ;

    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        System.out.println(Exercise7.i);
        sf.increment();
        System.out.println(Exercise7.i);
        Incrementable.increment();
        System.out.println(Exercise7.i);
    }
}

class Incrementable{
    static void increment(){
        Exercise7.i ++;
    }
}/*
    Output(100%)
        47
        48
        49
*///:~
