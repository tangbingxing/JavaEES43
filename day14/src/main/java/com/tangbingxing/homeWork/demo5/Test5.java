package com.tangbingxing.homeWork.demo5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Classname Test5
 * @Description 作业题5
 * @Version 1.0.0
 * @Date 2023/8/2 16:17
 * @Created by m1346
 */

public class Test5 {
    public static void main(String[] args) throws Exception {

        getAllMethods();
        invokeRun();
        invokeEat1();
        invokeEat2();


    }

    public static void getAllMethods(){
        //DONE:: 请获取Cat类的所有方法
        Class<Cat> clazz = Cat.class;
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
    }

    public static void invokeRun() throws Exception{

        //DONE:: 请使用反射的方式调用Cat类中的run方法
        Class<Cat> clazz = Cat.class;
        Method run = clazz.getDeclaredMethod("run");
        run.setAccessible(true);
        run.invoke(new Cat());
    }


    public static void invokeEat1() throws Exception{

        //DONE:: 请使用反射的方式调用Cat类中的eat 无参方法
        Class<Cat> clazz = Cat.class;
        Method eat = clazz.getDeclaredMethod("eat");
        eat.setAccessible(true);
        eat.invoke(new Cat());
    }


    public static void invokeEat2() throws Exception{

        //DONE:: 请使用反射的方式调用Cat类中的eat 有参方法
        Class<Cat> clazz = Cat.class;
        Method eat = clazz.getDeclaredMethod("eat", String.class);
        eat.setAccessible(true);
        eat.invoke(new Cat(),"鱼");
    }
}
