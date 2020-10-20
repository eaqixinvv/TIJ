//: initialization/Exercise6.java
package com.eaqixinvv.chapter5.exercise;

/**
 * Modify the previous exercise so that two of the overloaded methods have
 * two arguments(of two different type),but in reversed order relative to
 * each other.Verify that this work
 * @author eaqixinvv
 * @create 2020-10-20 11:11
 **/

class Dog2{
    public void bark(int i ,double d){
        System.out.println("bark:"+i +"  ,  "+d);
    }
    public void bark(double d,int i){
        System.out.println("bark:"+d +"  ,  "+i);
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        int i = 1;
        double d = 10.0D;
        float f = 10.56F;
        dog2.bark(i,f);
        dog2.bark(d,(int)f);
    }
}
//:~
