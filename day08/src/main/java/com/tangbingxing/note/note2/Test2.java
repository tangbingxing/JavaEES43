package com.tangbingxing.note.note2;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Classname Test2
 * @Description 使用TreeMap存储自定义类型的键,保证键唯一,并对键排序
 * @Version 1.0.0
 * @Date 2023/7/24 17:19
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        //使用无参构造器创建TreeSet集合
        TreeSet<Student> students = new TreeSet<>();

        //使用有参构造器创建TreeSet集合
        TreeSet<Student> students1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        //添加元素到集合
        students.add(new Student("Tom",18));
        students.add(new Student("Jack",22));
        students.add(new Student("CaiCy",16));

        //添加元素到集合
        students1.add(new Student("Tom",18));
        students1.add(new Student("Jack",22));
        students1.add(new Student("CaiCy",16));

        //打印输出
        //在自定义对象所属的类中实现Comparable接口，重写compareTo()方法
        students.forEach(System.out::println);
        System.out.println("=========");
        //在构造器中传入Comparator排序器;可以覆盖类中的compareTo()方法
        students1.forEach(System.out::println);
    }
}
