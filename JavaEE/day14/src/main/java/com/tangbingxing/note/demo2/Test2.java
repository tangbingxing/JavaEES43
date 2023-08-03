package com.tangbingxing.note.demo2;

import com.tangbingxing.note.demo1.Cat;

/**
 * 通过反射获取类的字节码对象
 * @Classname Test2
 * @Description 笔记2
 * @Version 1.0.0
 * @Date 2023/8/3 16:15
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        //类名.class
        Class<Cat> clazz1 = Cat.class;
        //Object类的getClass方法，使用对象调用该方法
        Cat cat = new Cat();
        Class<? extends Cat> clazz2 = cat.getClass();
        //Class类的静态方法forName(),传入了类的全限定名
        try {
            Class<?> clazz3 = Class.forName("com.tangbingxing.note.demo1.Cat.java");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
