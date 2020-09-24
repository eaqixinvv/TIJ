//:Object/Practice8.java
package com.eaqixinvv.chapter3.practice;

/**
 * 练习8 展示用十六进制和八进制记数法来操作long传值,用Long.toBinaryString()来显示结果
 * @author eaqixinvv
 * @create 2020-09-24 17:52
 **/
public class Practice8 {

    public static void main(String[] args) {
        Long l1 = 07742L;
        Long l2 = 0xfac12L;
        System.out.println(Long.toBinaryString(l1));
        System.out.println(Long.toBinaryString(l2));
    }

}
//:~
