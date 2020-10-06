//:operators/Equivalence.java
package com.eaqixinvv.chapter3;

/**
 * 3.7.1 测试对象的等价性
 * @author eaqixinvv
 * @create 2020-09-24 13:58
 **/
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);

        // 尽管两对象的内容相同，但是它们的引用却不相同
        // ==、!= 比较的就是引用
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }
}/*
    Output
        false
        true
*///:~
