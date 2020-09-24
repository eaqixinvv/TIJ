//:Operators/Assignment.java
package com.eaqixinvv.chapter3;
import static net.mindview.util.Print.*;
/**
 * 3.4 赋值
 * @author eaqixinvv
 * @create 2020-09-23 17:57
 **/

class Tank{
    int level;
}
public class Assignment {
    public static void main(String[] args) {
        // 两个独立的栈，堆栈
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9 ;
        t2.level = 47 ;
        print("1.t1.level:"+t1.level +
                    ",t2.level:"+t2.level);
        // t1的栈指向原有t2的堆
        t1 = t2 ;
        print("2.t1.level:"+t1.level +
                ",t2.level:"+t2.level);
        t1.level = 27;
        print("3.t1.level:"+t1.level +
                ",t2.level:"+t2.level);
    }
}/*
    Output
        1.t1.level = 9,t2.level = 47
        2.t1.level = 47,t2.level = 47
        3.t1.level = 27,t2.level = 27
*///:~
