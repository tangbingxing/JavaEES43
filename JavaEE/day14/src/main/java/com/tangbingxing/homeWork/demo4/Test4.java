package com.tangbingxing.homeWork.demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Classname Test4
 * @Description 作业题4
 * @Version 1.0.0
 * @Date 2023/8/1 19:40
 * @Created by m1346
 */

public class Test4 {
    public static void main(String[] args) throws Exception {
        Class<Cat> clazz = Cat.class;
        //1. 获取Cat类的所有属性，并且打印出来属性的名字以及属性的类型
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "  "+field.getType());
        }

        //2. 使用反射的方式尝试获取某一个对象的 name属性的值
        Field field = clazz.getDeclaredField("name");
        Constructor<Cat> constructor1 = clazz.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Cat cat1 = constructor1.newInstance("汤姆");
        System.out.println(field.get(cat1));

        //3. 使用反射的方式给某一个对象的name属性和age属性赋值
        Constructor<Cat> constructor = clazz.getConstructor();
        Cat cat = constructor.newInstance();
        clazz.getDeclaredField("name").set(cat,"汤姆");
        clazz.getDeclaredField("age").set(cat,2);
    }
}
