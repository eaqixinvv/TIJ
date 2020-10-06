//:Operators/Practice10.java
package com.eaqixinvv.chapter3.practice;

/**
 * 编写一个具有两个常量的程序,
 * 一个具有交替的二进制位1和0，其中最低的有效位为0
 * 另一个也具有交替的二进制位的1和0，但是最低的有效位为1
 * 取这两个值，用按位操作符所有可能方式结合运算它们，然后用
 * {@link Integer#toBinaryString(int)}显示
 * @author eaqixinvv
 * @create 2020-09-28 09:52
 **/
public class Practice10 {

    public static void main(String[] args) throws Exception {
        String aStr = "1010101";
        String bStr = "0101010";

        Byte a = Byte.parseByte(aStr,2);
        Byte b = Byte.parseByte(bStr,2);
        // | 一1 则1
        System.out.print("a | b :");
        System.out.println( Integer.toBinaryString(a | b));

        //& 一0则0
        System.out.print("a & b :");
        System.out.println(Integer.toBinaryString(a & b));

        // ^ 同值取0 ，不同取1
        System.out.print("a ^ b :");
        System.out.println(Integer.toBinaryString(a ^ b));
        // ~
        System.out.println("~b");
        System.out.println(Integer.toBinaryString(~b) );

    }
}
//:~
