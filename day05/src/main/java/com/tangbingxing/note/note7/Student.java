package com.tangbingxing.note.note7;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/**
 * @Classname Student
 * @Description 自定义学生类
 * @Version 1.0.0
 * @Date 2023/7/24 21:11
 * @Created by m1346
 */

public class Student implements Comparable<Student> {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        Collator instance = Collator.getInstance(Locale.CHINA);
        return instance.compare(this.name,o.name);
    }
}
