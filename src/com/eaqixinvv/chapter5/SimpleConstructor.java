//:initialization/SimpleConstructor.java
package com.eaqixinvv.chapter5;

/**
 * 5.1 Guaranteed initialization with the constructor
 * @author eaqixinvv
 * @create 2020-10-19 13:53
 **/

class Rock{
    Rock(){  // This is the constructor
        System.out.print("Rock ");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10 ; i ++ ){
            new Rock();
        }
    }
}/*
    Output
    Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock
*///:~
