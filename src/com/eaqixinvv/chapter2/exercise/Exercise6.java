//:Object/Exercise6.java
package com.eaqixinvv.chapter2.exercise;

/**
 * write a program that includes and calls the <b>storage()</b>
 * method defined as a code fragment in this chapter
 *
 * @author eaqixinvv
 * @author eaqixinvv@outlook.com
 * @create 2020-09-23 14:34
 **/
public class Exercise6 {

    String s = "Hello World";

    /**
     * calc the storage of a string
     * The size of each char in a String is 16 bits,or 2 bytes,to support Unicode Character
     * @param s
     * @return
     */
    int storage(String s ){
        return s.length() * 2 ;
    }

    public static void main(String[] args) {
        Exercise6 exercise6 = new Exercise6();
        // sending a  message to an object
        // storage() is a message
        // exercise6 is an object
        int storage = exercise6.storage(exercise6.s);
        System.out.println(storage);
    }
}/*
    Output(100%)
        22
*///:~
