//:Operators/RoundingNumbers.java
package com.eaqixinvv.chapter3;
import static net.mindview.util.Print.*;
// Rounding floats and doubles
/**
 * 3.15.1 舍入
 * @author eaqixinvv
 * @author eaqixinvv@outlook.com
 * @createDate 20-10-6 上午11:08
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7 ;
        double below = 0.4 ;
        float  fabove = 0.7F;
        float  fbelow = 0.4F;

        print("Math.round(above) :" + Math.round(above));
        print("Math.round(below) :" + Math.round(below));
        print("Math.round(fabove) :" + Math.round(fabove));
        print("Math.round(fbelow) :" + Math.round(fbelow));

    }
}/*
    Output
        Math.roud(above) : 1
        Math.roud(below) : 0
        Math.roud(fabove) : 1
        Math.roud(fbelow) : 0
*///:~
