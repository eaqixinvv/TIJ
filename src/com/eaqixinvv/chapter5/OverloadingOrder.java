//:initialization/OverloadingOrder.java
// Overloading based on the order of the argument
package com.eaqixinvv.chapter5;
import static net.mindview.util.Print.*;
/**
 * 5.2.1 distinguishing overloaded method
 * @author eaqixinvv
 * @create 2020-10-19 16:12
 **/
public class OverloadingOrder {
    static void f(String s ,int i ){
        print("String: " + s + " , int: "+i);
    }
    static void f(int i , String s){
        print("int: " + s + " , String: "+i);
    }

    public static void main(String[] args) {
        f("String first",11);
        f(99,"Int first");
    }

}
//:~
