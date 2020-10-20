//:initialization/Exercise1.java
package com.eaqixinvv.chapter5.exercise;

/**
 * create a class containing an uninitialized {@link String} reference
 * Demonstrate that this reference is initialized by Java to null
 * @author eaqixinvv
 * @create 2020-10-19 14:17
 **/
public class Exercise1 {

    // uninitialized String reference
    String str ;

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        System.out.println(exercise1.str);
    }
}
/*
    Output
        null
*///:~
