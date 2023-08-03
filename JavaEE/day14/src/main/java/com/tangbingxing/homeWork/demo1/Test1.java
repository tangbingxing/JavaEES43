package com.tangbingxing.homeWork.demo1;

/**
 * 假设在包下有一个Student类，那么请使用三种方式获取该学生类的字节码对象
 * @Classname Test1
 * @Description 作业题1
 * @Version 1.0.0
 * @Date 2023/8/1 18:16
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        //通过getClass获取
        Student student = new Student();
        Class clazz1 = student.getClass();

        //2.通过类名.class获取
        Class clazz2 = Student.class;

        //3.通过Class中的静态方法forName()获取
        try {
            Class clazz3 = Class.forName("com.tangbingxing.homeWork.demo1.Student");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
