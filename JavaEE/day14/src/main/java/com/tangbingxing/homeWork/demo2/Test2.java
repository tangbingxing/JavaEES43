package com.tangbingxing.homeWork.demo2;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * 根据提供的 Cat类， 获取该类的构造方法
 * @Classname Test2
 * @Description 作业题2
 * @Version 1.0.0
 * @Date 2023/8/1 18:16
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) throws Exception {
        Class<Cat> clazz = Cat.class;
        //1. 获取无参构造方法
        Constructor<Cat> constructor = clazz.getConstructor();


        //2. 获取单个参数的构造方法
        Constructor<Cat> constructor1 = clazz.getDeclaredConstructor(String.class);
        //3. 获取两个参数的构造方法
        Constructor<Cat> constructor2 = clazz.getDeclaredConstructor(String.class, int.class);

        //4. 获取所有的构造方法
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        System.out.println("无参构造方法" + constructor);
        System.out.println("有一个参数的构造方法" + constructor1);
        System.out.println("有两个参数的构造方法" + constructor2);
        System.out.println("所有的构造方法" + Arrays.toString(constructors));
    }

}
