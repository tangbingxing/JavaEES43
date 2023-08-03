package com.tangbingxing.homeWork.demo3;

import java.lang.reflect.Constructor;

/**
 * 请根据提供的Cat类，使用反射的方式创建对象
 * @Classname Test3
 * @Description 作业题3
 * @Version 1.0.0
 * @Date 2023/8/1 18:17
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) throws Exception {
        Class<Cat> clazz = Cat.class;
        //1. 通过无参构造方法创建对象
        Cat cat = clazz.getConstructor().newInstance();

        //2. 通过单个参数的构造方法创建对象   name: 汤姆
        Constructor<Cat> constructor1 = clazz.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Cat cat1 = constructor1.newInstance("汤姆");

        //3. 通过两个参数的构造方法创建对象 name: 汤姆 , age: 2
        Constructor<Cat> constructor2 = clazz.getDeclaredConstructor(String.class, int.class);
        constructor2.setAccessible(true);
        Cat cat2 = constructor2.newInstance("汤姆", 2);
    }
}
