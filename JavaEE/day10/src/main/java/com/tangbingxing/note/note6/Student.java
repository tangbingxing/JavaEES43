package com.tangbingxing.note.note6;

import java.io.Serializable;

/**
 * 创建学生对象，并实现序列化接口
 * phone 字段不需要序列化
 * @Classname Student
 * @Description 学生对象
 * @Version 1.0.0
 * @Date 2023/7/27 17:42
 * @Created by m1346
 */

public class Student implements Serializable {
    private String name;//姓名
    private transient String phone;//电话
    private int age;//年龄
    private double score;//分数

    public Student() {
    }

    public Student(String name, String phone, int age, double score) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
