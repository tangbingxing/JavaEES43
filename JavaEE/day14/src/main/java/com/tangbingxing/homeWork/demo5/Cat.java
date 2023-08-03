package com.tangbingxing.homeWork.demo5;

/**
 * @Classname Cat
 * @Description Cat类
 * @Version 1.0.0
 * @Date 2023/8/2 16:17
 * @Created by m1346
 */

public class Cat {
    public static int a;
    public static final String COUNTRY = "中国";
    private String name;
    private int age;

    public Cat() {
        this.name = "无名";
        System.out.println("无参数构造器执行了~~");
    }

    private Cat(String name) {
        System.out.println("有参数构造器执行了~~");
        this.name = name;
    }

    private Cat(String name, int age) {
        System.out.println("有参数构造器执行了~~");
        this.name = name;
        this.age = age;
    }

    private void run() {
        System.out.println("🐱跑的贼快~~");
    }

    public void eat() {
        System.out.println("🐱爱吃猫粮~");
    }

    private String eat(String name) {
        return "🐱最爱吃:" + name;
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
