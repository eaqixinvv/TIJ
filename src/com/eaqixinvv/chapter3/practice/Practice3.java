//:Operators/Practice3.java
package com.eaqixinvv.chapter3.practice;

/**
 * 练习3 创建一个包含一个float域的类
 * 并用该类来展示方法调用时的别名问题
 *
 * @author eaqixinvv
 * @create 2020-09-23 18:47
 **/
class Circle{
    float r ;
}

public class Practice3 {
    /**
     * 实际上操作的是changeR 方法外的对象
     * 也就是传递来的引用
     *
     * @param c
     */
    static  void changeR(Circle c){
        c.r = 100.56F;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.r = 32.9F;
        System.out.println("1.circle.r =" + circle.r);
        changeR(circle);
        System.out.println("2.circle.r =" + circle.r);
    }

}/*
    Output
        1.circle.r = 32.9
        2.circle.r = 100.56
*///:~
