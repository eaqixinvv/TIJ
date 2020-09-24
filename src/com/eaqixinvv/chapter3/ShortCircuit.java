//:operators/ShortCircuit.java
package com.eaqixinvv.chapter3;
// Demonstrates short-circuiting behavior
// with logical operators
import static net.mindview.util.Print.*;

/**
 * 3.8.1 短路
 * @author eaqixinvv
 * @create 2020-09-24 15:59
 **/
public class ShortCircuit {

    static boolean test1(int val){
        print("test1(" + val +")");
        print("result: "+( val < 1) );
        return val < 1;
    }

    static boolean test2(int val){
        print("test1(" + val +")");
        print("result: "+( val < 2) );
        return val < 2;
    }

    static boolean test3(int val){
        print("test1(" + val +")");
        print("result: "+( val < 3 ) );
        return val < 3 ;
    }

    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        print("expression is " + b);
    }

}/*
    Output
        test1(0)
        result: true
        test1(2)
        result: false
        expression is false
*///:~
