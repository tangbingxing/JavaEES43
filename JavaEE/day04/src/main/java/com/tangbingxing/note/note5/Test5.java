package com.tangbingxing.note.note5;

import java.util.ArrayList;

/**
 * 使用Arrays对Student类型的数组按照学生年龄降序排序,如果年龄相同,就按照学生的成绩升序排序
 * @Classname Test5
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/24 17:56
 * @Created by m1346
 */

public class Test5 {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<Student> students = new ArrayList<>();
        //创建Student对象
        Student s1 = new Student("Tom",15);
        Student s2 = new Student("CaiCy",22);
        Student s3 = new Student("Jack",18);
        Student s4 = new Student("Tony",18);
        //向集合中添加元素
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        //按照学生年龄降序排序
        //Collections.sort(Student);

        //打印结果
        students.forEach(s -> System.out.println(s.getName() + " " + s.getAge()));
    }
}
