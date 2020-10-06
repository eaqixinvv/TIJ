//:Object/Practice7.java
package com.eaqixinvv.chapter3.practice;

import java.util.Random;

/**
 * 练习7 编写一个程序，模拟扔硬币的结果
 * @author eaqixinvv
 * @create 2020-09-24 15:49
 **/
public class Practice7 {

    public static void main(String[] args) {
        Random random = new Random();
        boolean b = random.nextBoolean();
        if(b){
            System.out.println("硬币正面");
        }else {
            System.out.println("硬币反面");
        }
    }
}
//:~
