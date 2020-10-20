//: initialization/Exercise5.java
package com.eaqixinvv.chapter5.exercise;
import static net.mindview.util.Print.*;
/**
 * Create a class called <b>Dog</b> with an overloaded <b>bark()</b>
 * method.This method should be overloaded based on various primitive types ,
 * and print different types of barking,howling,etc. depending on which overloaded
 * version is called.Write a <b>main()</b> that calls all the different versions
 *
 * @author eaqixinvv
 * @create 2020-10-20 10:53
 **/

class Dog{
    public void bark(){print("barking: ");}
    public void bark(char x){print("barking char: "+x);}
    public void bark(byte x){print("barking byte: "+x);}
    public void bark(short x){print("barking short: "+x);}
    public void bark(int x){print("barking int : "+x);}
    public void bark(long x){print("barking long : "+x);}
    public void bark(float x){print("barking float : "+x);}
    public void bark(double x){print("barking double : "+x);}
}
public class Exercise5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(1);
        dog.bark(1.1);

    }
}
//:~
