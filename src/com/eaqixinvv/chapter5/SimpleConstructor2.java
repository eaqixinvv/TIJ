//:initialization/SimpleConstructor2.java
package com.eaqixinvv.chapter5;

/**
 * 5.1 Guaranteed initialization with constructor
 * @author eaqixinvv
 * @create 2020-10-19 14:04
 **/

class Rock2{
    // Constructors can have arguments
    Rock2(int i ){
        System.out.print("Rock"+  i + " ");
    }
}
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for(int i = 0 ; i < 8 ; i ++){
            new Rock2(i);
        }
    }
}
//:~
