package com.tangbingxing.testHashSet;

import java.util.HashSet;

/**
 * @Classname HashSetDemo
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 10:40
 * @Created by m1346
 */

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            students.add(new Student("Tom",i));
        }

        //当全存入数组时
        System.out.println(students);
    }
}
