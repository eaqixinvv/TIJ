//:Operators/Practice4.java
package com.eaqixinvv.chapter3.practice;

/**
 * 编写一个计算速度的程序，它所使用的距离和时间都是常量
 *
 * @author eaqixinvv
 * @author eaqixinvv@outlook.com
 * @create 2020-09-24 11:17
 **/
public class Practice4 {

    // distance is 318 meters
    static int distance = 318;
    // time is 23 seconds
    static int time = 23;

    /**
     * 根据 距离与时间计算速度
     * 公式为 speed = distance / time
     * @param distance  距离 单位:meter
     * @param time   时间 单位:second
     * @return 速度  单位为 m/s
     */
    public double calcVelocity(int distance,int time){
        double velocity = (distance * 1.0) / time;
        return velocity;
    }

    public static void main(String[] args) {
        Practice4 p = new Practice4();
        double velocity = p.calcVelocity(Practice4.distance,Practice4.time);
        System.out.println("The speed is " + velocity + " m/s");

    }

}
//:~
