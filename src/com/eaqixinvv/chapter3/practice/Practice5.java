//:Operators/Practice5.java
package com.eaqixinvv.chapter3.practice;

/**
 * 练习5
 *
 * 创建一个名为Dog的类，它包含两个String域:name和says.
 * 在main()方法中，创建两个对象，一个名为spot（它的叫声为"Ruff!"),另一个名为scruffy(它的叫声
 * 为"Wurf!").然后显示它们的名字和叫声
 *
 * @author eaqixinvv
 * @create 2020-09-24 14:33
 **/

class DogPractice5{
    String name;
    String says;
}
public class Practice5 {
    public static void main(String[] args) {
        DogPractice5 spot = new DogPractice5();
        DogPractice5 scruffy = new DogPractice5();
        spot.name = "spot";
        spot.says = "Ruff!";
        scruffy.name ="scruffy";
        scruffy.says="Wurf!";
        System.out.println(spot.name + " " + spot.says);
        System.out.println(scruffy.name + " " + scruffy.says);

    }
}
//:~
