package com.tangbingxing.homeWork.demo12;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Classname Test12
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 11:41
 * @Created by m1346
 */

public class Test12 {
    public static void main(String[] args) {

        Student[] students = {
                new Student("王五", 1.6, 20),
                new Student("李四", 1.7, 19),
                new Student("赵六", 1.7, 20),
                new Student("tianqi", 1.8, 22),
                new Student("tianan", 1.8, 22),
                new Student("张三", 1.8, 18),
                new Student("王振", 1.6, 22),
        };

        // 排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                // 按照年龄升序排序
                int rst = o1.getAge() - o2.getAge();
                if (rst != 0) {
                    return rst;
                }
                // 按照身高降序排序
                rst = Double.compare(o2.getHeight(), o1.getHeight());
                if (rst != 0) {
                    return rst;
                }
                // 按照姓名升序排序
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getAge() + " -> " + student.getHeight());
        }

    }
}
