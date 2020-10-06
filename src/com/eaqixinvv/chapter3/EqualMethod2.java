//:Operator/EqualsMethod2.java
package com.eaqixinvv.chapter3;

/**
 * 3.7.1 测试对象的等价性
 * @author eaqixinvv
 * @create 2020-09-24 14:22
 **/
class Value{
    int i ;
}

public class EqualMethod2 {
    public static void main(String[] args){
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100 ;
        System.out.println(v1.equals(v2));
    }
}/*
    Output
        false
*///:~
