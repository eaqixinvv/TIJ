//:Object/Practice2.java
package com.eaqixinvv.chapter3.practice;

/**
 * 练习2:创建一个包含一个float域的类
 * 并用这个类来展示别名问题
 *
 * @author eaqixinvv
 * @create 2020-09-23 18:08
 **/
public class Practice2 {
    float f ;

    public static void main(String[] args) {
        Practice2 p1 = new Practice2();
        Practice2 p2 = new Practice2();
        p1.f = 9.0F;
        p2.f = 15.8F;
        System.out.println("1.p1.f="+p1.f+
        ",p2.f="+p2.f);

        p2 = p1;
        System.out.println("2.p1.f="+p1.f+
                ",p2.f="+p2.f);

        p1.f = 77.6F ;
        System.out.println("3.p1.f="+p1.f+
                ",p2.f="+p2.f);

        p2.f = 100.9f;
        System.out.println("4.p1.f="+p1.f+
                ",p2.f="+p2.f);

    }
}/*
    Output
        1.p1.f=9.0,p2.f=15.8
        2.p1.f=9.0,p2.f=9.0
        3.p1.f=77.6,p2.f=77.6
        4.p1.f=100.9,p2.f=100.9
*///:~
