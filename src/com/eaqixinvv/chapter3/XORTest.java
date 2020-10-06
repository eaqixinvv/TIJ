//:Operator/XORTest.java
package com.eaqixinvv.chapter3;

/**
 * 异或:^操作
 * 同值取0 ，不同取1
 * @author eaqixinvv
 * @create 2020-09-24 18:41
 **/
public class XORTest {
    /**
     * 不用临时变量交换两个变量的值
     * @param a
     * @param b
     */
    static  void swap(int a ,int b ){
        System.out.println("a = " + a + ", b = " + b);
        a = a ^ b ;
        b = a ^ b ;
        a = a ^ b ;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 5 ;
        int b = 10;
        int c = 102;
        // 101
        System.out.println(Integer.toBinaryString(a));
        // 1010
        System.out.println(Integer.toBinaryString(b));
        // 交换律 a^b = b ^a
        System.out.println((a^b)==(b^a));
        // 结合律 (a^b)^c = a^(b^c)
        System.out.println(((a^b)^c) == (a^(b^c)));
        // 对于任意数 x^x=0，x^0 = x
        System.out.println(a^a);
        System.out.println(a^0);

        // 自反性 a ^ b ^ b = a ^ ( b ^ b ) = a ^0 = a
        System.out.println(a ^ b ^ b);
        swap(a,b);

    }
}/*
    Output
        101
        1010
        true
        true
        0
        5
        5
        a = 5, b = 10
        a = 10, b = 5
*///:~
