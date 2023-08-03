package com.tangbingxing.note.note1;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @Classname Test1
 * @Description 使用HashMap,LinkedHashMap集合存储自定义类型的键,保证键唯一
 * @Version 1.0.0
 * @Date 2023/7/24 17:11
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<Student,String> hashMap = new HashMap<>();
        //创建LinkedHashMap集合
        LinkedHashMap<Student,String> linkedHashMap = new LinkedHashMap<>();
        //通过自定义类中的hashCode和equals方法保证键的值唯一
        Student s1 = new Student("Jack",17);
        Student s2 = new Student("Tom",27);
        Student s3 = new Student("Gen",24);
        Student s4 = new Student("Gen",24);
        //将元素存入集合
        hashMap.put(s1,"广东");
        hashMap.put(s2,"广西");
        hashMap.put(s3,"河南");
        hashMap.put(s4,"河北");
        //打印输出
        hashMap.forEach((k,v) -> System.out.println(k + " -> " + v));

        System.out.println("=========");

        //将元素存入集合
        linkedHashMap.put(s1,"广东");
        linkedHashMap.put(s2,"广西");
        linkedHashMap.put(s3,"河南");
        linkedHashMap.put(s4,"河北");
        //打印输出
        linkedHashMap.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
