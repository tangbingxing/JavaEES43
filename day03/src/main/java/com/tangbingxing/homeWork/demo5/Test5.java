package com.tangbingxing.homeWork.demo5;

import java.util.Objects;

/**
 * @Classname Test5
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/14 18:03
 * @Created by m1346
 */

public class Test5 {
    public static void main(String[] args) {
        Student stu1 = new Student("Tom",20);
        Student stu2 = new Student("Tom",20);
        //判断两个对象是否地址一样，一样直接返回true
        System.out.println(stu1 == stu2);
        //判断两个对象属性值是否一样，一样直接返回true
        System.out.println(stu1.equals(stu2));
        //进行非空判断，避免空指针异常
        System.out.println(Objects.equals(stu1,stu2));
    }
}
