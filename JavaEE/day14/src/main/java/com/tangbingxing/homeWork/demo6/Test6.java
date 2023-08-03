package com.tangbingxing.homeWork.demo6;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 解析Demo中的注解，理解注解的作用。
 *
 * - 请在Task的parseClass方法中解析Demo类上的所有注解，并打印出来。
 * - 请在Task的parseMethod方法中解析Demo类中的test1方法上的注解，并打印出来。
 *
 * 注解信息打印格式示例：
 * @Classname Test6
 * @Description 作业题6
 * @Version 1.0.0
 * @Date 2023/8/2 16:27
 * @Created by m1346
 */

public class Test6 {
    public static void main(String[] args) throws NoSuchMethodException {
        parseClass();
        parseMethod();
    }

    //解析Demo类上的所有注解，并打印出来
    public static void parseClass(){
        //1.获取类的字节码文件
        Class<Demo> clazz = Demo.class;
        //2.解析Demo类上的所有注解
        Annotation[] annotations = clazz.getAnnotations();
        //3.，打印
        for (Annotation annotation : annotations) {
            String name = annotation.annotationType().getSimpleName();
            System.out.println("-------" + name + "-------");
        }
    };

    //解析Demo类中的test1方法上的注解，并打印出来
    public static void parseMethod() throws NoSuchMethodException {
        //1.获取类的字节码文件
        Class<Demo> clazz = Demo.class;
        //2.获取方法上的注解，并打印
        Method test1 = clazz.getMethod("test1");
        MyTest annotation = test1.getAnnotation(MyTest.class);
        System.out.println("value = " + annotation.value());
        System.out.println("aaa = " +  annotation.aaa());
        System.out.println("bbb = " + Arrays.toString(annotation.bbb()));
    };
}
