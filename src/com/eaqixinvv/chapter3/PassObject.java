//:Operators/PassObject.java
package com.eaqixinvv.chapter3;

/**
 * 3.4.1 方法调用中的别名问题
 * @author eaqixinvv
 * @create 2020-09-23 18:28
 **/
class Letter{
    char c ;
}

public class PassObject {
    /**
     * 实际改变的是方法之外的对象
     * 也就是传递来的对象的引用
     * @param y
     */
    static void f(Letter y){
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c = " + x.c);
        f(x);
        System.out.println("2: x.c = " + x.c);

    }
}/*
    Output
        1:x.c = a
        2:x.c = z
*/
//:~
