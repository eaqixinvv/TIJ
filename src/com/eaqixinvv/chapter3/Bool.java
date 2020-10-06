//:Operator/Bool.java
//Relational and logical operator
package com.eaqixinvv.chapter3;

import java.util.Random;
import static net.mindview.util.Print.*;

/**
 * 3.8 逻辑操作符
 * @author eaqixinvv
 * @create 2020-09-24 15:17
 **/
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        // [0,bound),bound must be positive
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        print("i = " + i);
        print("j = " + j);
        print("i > j is " +(i > j));
        print("i < j is " +(i < j));
        print("i >= j is "+(i >= j));
        print("i <= j is "+(i <= j));
        print("i == j is "+(i == j));
        print("i != j is "+(i !=j));
        // Treating an int as a boolean is not legal
        //! print("i && j is "+(i && j));
        //! print("i || j is " + (i || j));
        //! print("!i is " + !i);
        print("( i < 10 ) && （ j < 10 ) is "
        +( ( i < 10 ) && ( j < 10 ) ) );
        print("( i< 10 ) || ( j < 10 ) is "
        + ( ( i < 10 ) || ( j < 10 ) ) );
    }
}/*
    Output
        i = 58
        j = 55
        i > j is true
        i < j is false
        i >= j is true
        i <= j is false
        i == j is false
        i != j is true
        ( i < 10 ) && （ j < 10 ) is false
        ( i < 10 ) ||（ j < 10 ) is false
*///:~
