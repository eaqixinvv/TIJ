//:Operators/Casting.java
package com.eaqixinvv.chapter3;

/**
 * 3.15 类型转换
 * @author eaqixinvv
 * @author eaqixinvv@outlook.com
 * @createDate 20-10-6 上午10:34
 */
public class Casting {
    public static void main(String[] args) {
        int i = 200 ;
        long lng = (long)i ;
        lng = i ; //"Widening" ,so cast not really required
        long lng2 = (long)200 ;
        lng2 = 200 ;
        // A "narrowing conversion"
        i = (int)lng2;
    }
}
//:~
