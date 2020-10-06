//:operators/StringOperators.java
package com.eaqixinvv.chapter3;
import static net.mindview.util.Print.*;
/**
 * 3.13 字符串操作符 + 和 +=
 * @author eaqixinvv
 * @author eaqixinvv@outlook.com
 * @createDate 20-10-6 上午10:18
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0 , y = 1 ,z = 2 ;
        String s = " x,y,z";
        print(s + x +  y + z );
        print(x + " " + s); // Converts x to String
        s += "(summed) = ";
        print(s + (x + y + z));
        print(" " + x);

    }
}
/*
    Output
        x,y,z 012
        0  x,y,z
        x,y,z (summed) = 3
         0
*///:~
