//:Operators/Practice6.java
package com.eaqixinvv.chapter3.practice;
import static net.mindview.util.Print.*;
/**
 * 练习6
 * 在{@link Practice5}的基础上,创建一个新的Dog索引
 * 并对其赋值为spot对象.测试用==和equals()方法来比较所有引用的结果
 *
 * @author eaqixinvv
 * @create 2020-09-24 14:40
 *
 **/
public class Practice6 {

    static void compare(DogPractice5 dog1,DogPractice5 dog2){
        print("== on top references:" + (dog1 == dog2));
        print("equals on top references:" + (dog1.equals(dog2)));
        print("== on names:" + (dog1.name == dog2.name));
        print("equals on names:" + dog1.name.equals(dog2.name) );
        print("== on says:" +(dog1.says == dog2.says));
        print("equals on says:" + dog1.says.equals(dog2.says));
    }

    public static void main(String[] args) {
        DogPractice5 dog1 = new DogPractice5();
        DogPractice5 dog2 = new DogPractice5();
        DogPractice5 dog3 = dog1;
        dog1.name = "spot";
        dog1.says = "ruff!";
        dog2.name = "scruffy";
        dog2.says = "wurf!";
        print("Comparing dog1 and dog2 objects...");
        compare(dog1,dog2);
        print("Comparing dog1 and dog3 objects...");
        compare(dog1,dog3);
        print("Comparing dog2 and dog3 objects...");
        compare(dog2,dog3);
    }
}/*
    Output
        Comparing dog1 and dog2 objects...
        == on top references:false
        equals on top references:false
        == on names:false
        equals on names:false
        == on says:false
        equals on says:false
        Comparing dog1 and dog3 objects...
        == on top references:true
        equals on top references:true
        == on names:true
        equals on names:true
        == on says:true
        equals on says:true
        Comparing dog2 and dog3 objects...
         == on top references:false
        equals on top references:false
        == on names:false
        equals on names:false
        == on says:false
        equals on says:false
*///:~
