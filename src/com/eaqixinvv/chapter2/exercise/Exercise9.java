//:Object/Exercise9.java
package com.eaqixinvv.chapter2.exercise;

/**
 * Write a program that demonstrates that autoboxing works
 * for all the primitive types and their wrappers
 *
 * @author eaqixinvv
 * @author eaqixinvv@outlook.com
 * @create 2020-09-23 15:05
 **/
public class Exercise9 {

    public static void main(String[] args) {
        Byte bw = 1;
        byte bp = bw ;
        System.out.println("byte = " + bp);
        Short sw = 1;
        short sp = sw ;
        System.out.println("short = " + sp);
        Integer iw = 1 ;
        int ip = iw ;
        System.out.println("int = " + ip);
        Long lw = 1L;
        long lp = lw ;
        System.out.println("long = " + lp);
        Float fw = 1.0F;
        float fp = fw ;
        System.out.println("float = " + fp);
        Double dw = 1.0D;
        double dp = dw ;
        System.out.println("double = " + dp);
        Character cw = '\u0000';
        char cp = cw;
        System.out.println("char = " + cp);
        Boolean blw = true;
        boolean blp = blw ;
        System.out.println("boolean = " + blp);
    }
}
//:~
