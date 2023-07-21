package com.tangbingxing.testHashSet;

import java.util.Objects;

/**
 * @Classname Student
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 10:39
 * @Created by m1346
 */

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return age;
    }
}
