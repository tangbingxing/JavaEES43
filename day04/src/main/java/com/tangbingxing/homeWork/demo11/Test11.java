package com.tangbingxing.homeWork.demo11;

import java.util.Arrays;

/**
 * @Classname Test11
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 10:44
 * @Created by m1346
 */

public class Test11 {
    public static void main(String[] args) {

        Student[] students = {
                new Student("王五", 1.6, 20),
                new Student("李四", 1.7, 19),
                new Student("赵六", 1.7, 20),
                new Student("田七", 1.8, 22),
                new Student("张三", 1.8, 18),
                new Student("王振", 1.6, 22),
        };

        // 排序
        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getAge() + " -> " + student.getHeight());
        }

    }
}
