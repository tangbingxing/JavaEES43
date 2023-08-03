package com.tangbingxing.note.demo1;

/**
 * @Classname Cat
 * @Description Cat类
 * @Version 1.0.0
 * @Date 2023/8/1 18:19
 * @Created by m1346
 */

public class Cat {
    private String name;
    private int age;

    public Cat() {
        System.out.println("无参数构造器执行了~~");
    }

    private Cat(String name) {
        this.name = name;
    }

    private Cat(String name, int age) {
        System.out.println("有参数构造器执行了~~");
        this.name = name;
        this.age = age;
    }
}
