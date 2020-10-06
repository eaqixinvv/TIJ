//:Operators/CastingNumbers.java
// What happens when you cast a float
// or double to an integral value ?
package com.eaqixinvv.chapter3;
import static net.mindview.util.Print.*;

/**
 * 3.15.1 截尾和舍入
 * @author eaqixinvv
 * @author eaqixinvv@outlook.com
 * @createDate 20-10-6 上午10:59
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7 ;
        double below = 0.4 ;
        float fabove = 0.7F;
        float fbelow = 0.4F ;

        print("(int)above :" + (int) above);
        print("(int)below :" + (int)below);
        print("(int)fabove :" + (int)fabove);
        print("(int)fbelow :" + (int)fbelow);
    }
}/*
    Output
        (int)above : 0
        (int)below : 0
        (int)fabove : 0
        (int)fbelow : 0
*///:~
