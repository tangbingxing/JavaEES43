package com.tangbingxing.homeWork.demo12;

/**
 * @Classname Student
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 10:44
 * @Created by m1346
 */

public class Student {
    private String name;
    private double height;
    private int age;

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
