//:initialization/Overloading.java
package com.eaqixinvv.chapter5;
import static net.mindview.util.Print.*;
/**
 * Demonstration of both constructor
 * and ordinary method overloading
 *
 * @author eaqixinvv
 * @create 2020-10-19 14:59
 **/

class Tree{
    int height ;
    Tree(){
      print("Planting a seedling");
      height = 0 ;
    }

    Tree(int initialHeight){
        height = initialHeight;
        print("Creating new tree that is " + height + " feet tall");
    }

    void info(){
        print("Tree is " + height + " feet tall");
    }

    void info(String s){
        print(s + "Tree is " + height + " feet tall");
    }
}
public class Overloading {
    public static void main(String[] args) {
        for(int i = 0 ;i < 5 ; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method ");
        }
        // Overloaded constructor
        new Tree();
    }
}
//:~
