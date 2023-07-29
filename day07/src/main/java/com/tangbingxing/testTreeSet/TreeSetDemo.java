package com.tangbingxing.testTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Classname TreeSetDemo
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 20:02
 * @Created by m1346
 */

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        students.add(new Student("Tom","man",20));
        students.add(new Student("Jack","man",23));
        students.add(new Student("Jany","woman",18));
        System.out.println(students);
    }
}
