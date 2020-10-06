//:Object/Exercise11.java
package com.eaqixinvv.chapter2.exercise;

/**
 * Turn the AllTheColorOfTheRainbow example into
 * a program that compiles and runs
 *
 * @author eaqixinvv
 * @create 2020-09-23 15:40
 **/
public class Exercise11 {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        Exercise11 exercise11 = new Exercise11();
        exercise11.changeTheHueOfTheColor(3);
    }
}
//:~
