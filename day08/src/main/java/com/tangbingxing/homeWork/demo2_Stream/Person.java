package com.tangbingxing.homeWork.demo2_Stream;

/**
 * @Classname Person
 * @Description Person自定义类
 * @Version 1.0.0
 * @Date 2023/7/24 20:24
 * @Created by m1346
 */

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
