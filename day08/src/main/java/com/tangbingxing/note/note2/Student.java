package com.tangbingxing.note.note2;

import java.util.Objects;

/**
 * @Classname Student
 * @Description 自定义学生类
 * @Version 1.0.0
 * @Date 2023/7/24 17:20
 * @Created by m1346
 */

public class Student implements Comparable<Student>{
    private String name;//姓名
    private int age;//年龄

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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
