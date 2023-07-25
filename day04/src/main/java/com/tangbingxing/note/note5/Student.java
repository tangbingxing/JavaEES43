package com.tangbingxing.note.note5;

import java.util.Comparator;

/**
 * @Classname Student
 * @Description 自定义学生类
 * @Version 1.0.0
 * @Date 2023/7/24 21:11
 * @Created by m1346
 */

public class Student implements Comparator<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.age == o2.age) {
            return o1.name.compareTo(o2.name);
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}
