//:initialization/Exercise2.java
package com.eaqixinvv.chapter5.exercise;

/**
 * Create a class with a String field that is
 * initialized at the point of definition ,and the
 * other is initialized by constructor .
 * What is the difference between the two approaches
 * @author eaqixinvv
 * @create 2020-10-19 14:24
 **/
public class Exercise2 {

    String str1 = "initialized value";
    String str2 ;

    Exercise2(String str2 ){
        this.str2 = str2;
    }


    public static void main(String[] args) {
        // The str1 field is initialized before constructor is entered;
        // technically ,so is the str2 field , which is set to null as the
        // object is created. The more flexible str2 field lets you choose
        // what value to give it when you call the constructor,whereas str1
        // always has the same value
        Exercise2 exercise2 = new Exercise2("initialized value");
        System.out.println("exercise2.str1="+exercise2.str1);
        System.out.println("exercise2.str2="+exercise2.str2);

    }
}
//:~
