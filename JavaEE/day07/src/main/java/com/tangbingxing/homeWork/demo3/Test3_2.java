package com.tangbingxing.homeWork.demo3;

import java.util.TreeSet;

/**
 * @Classname Test3_2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 17:03
 * @Created by m1346
 */

public class Test3_2 {
    public static void main(String[] args) {
        //定义一个存储Student类型的HashSet集合
        TreeSet<Student> students = new TreeSet<Student>();
        //创建以下三个Student对象
        //张三,男,20
        //李四,女,21
        //张三,男,20
        //将上述三个对象存储到Set集合中
        students.add(new Student("张三","男",20));
        students.add(new Student("李四","女",21));
        students.add(new Student("张三","男",20));
        //使用增强for遍历集合，获取每个Student对象，并打印属性值；
        for (Student student : students) {
            System.out.println(student);
        }
        //请实现集合中不能存储姓名年龄相同的元素
        //重写Student类中的equals和hashCode方法
    }
}
