//: initialization/Exercise4.java
package com.eaqixinvv.chapter5.exercise;

/**
 * Add an overloaded constructor to the previous exercise
 * that take a {@link String} argument and prints it along with your message
 *
 * @author eaqixinvv
 * @create 2020-10-20 10:49
 * @see Exercise3
 **/
public class Exercise4 {

    Exercise4(){
        System.out.println("you create a object");
    }

    Exercise4(String msg){
        System.out.println(msg + "you create a object");
    }

    public static void main(String[] args) {
        Exercise4 obj1 = new Exercise4();
        Exercise4 obj2 = new Exercise4("obj2 ");

    }
}
//:~
