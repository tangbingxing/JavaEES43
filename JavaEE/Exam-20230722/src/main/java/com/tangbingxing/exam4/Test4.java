package com.tangbingxing.exam4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 1. 定义一个学生类,定义id(学号),name(姓名),score(分数),提供对应的get/set, 以及空参和满参构造方法
 * 2. 定义测试类
 *    1. 定义一个ArrayList集合 list
 *    2. 创建5个学生对象
 *    3. 调用add方法将5个学生信息存到list集合中
 *    4. 利用Collections中的sort方法将5个学生按照考试成绩进行从大到小的排序
 *    5. 遍历集合,将属性值输出出来
 *    6. 删除前三名以后的考生
 *    7. 打印前三名同学信息
 * @Classname Test4
 * @Description 测试类
 * @Version 1.0.0
 * @Date 2023/7/22 10:52
 * @Created by m1346
 */

public class Test4 {
    public static void main(String[] args) {
        //定义一个ArrayList集合 list
        ArrayList<Student> list = new ArrayList<>();
        //创建5个学生对象
        Student s1 = new Student(1,"张三",98);
        Student s2 = new Student(2,"李四",86);
        Student s3 = new Student(3,"王五",90);
        Student s4 = new Student(4,"赵六",89);
        Student s5 = new Student(5,"麻七",76);
        //调用add方法将5个学生信息存到list集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        //将学生按照考试成绩从大到小排序
        Collections.sort(list,(o1,o2)->o2.getScore() - o1.getScore());

        //使用普通for遍历集合
        for (int i = 0; i < list.size(); i++) {
            if (i >= 3) {
                //删除前3名以后的考生
                list.remove(i);
                i--;
            } else {
                //打印前三名同学信息
                System.out.println("学号:" + list.get(i).getId()
                        + ", 姓名:" + list.get(i).getName() + ", 成绩:" + list.get(i).getScore());
            }
        }

        System.out.println(list);
    }
}
