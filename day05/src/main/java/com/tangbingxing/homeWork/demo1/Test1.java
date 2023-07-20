package com.tangbingxing.homeWork.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 请将`Lambda`表达式作为`Arrays.sort`排序的第二个参数，实现对`Student`对象的排序。
 *
 * - 排序按照`age`从小到大排序
 * @Classname Test1
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 16:55
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",110.5,15);
        Student s2 = new Student("李四",122.5,20);
        Student s3 = new Student("王五",130.5,25);
        Student[] arr = {s3,s2,s1};
        System.out.println("排序前的数组" + Arrays.toString(arr));
        Arrays.sort(arr,(o1,o2)->o1.getAge() - o2.getAge());
        //Arrays.sort(arr, Comparator.comparingInt(Student::getAge));
        System.out.println("排序后的数组" + Arrays.toString(arr));
    }
}
