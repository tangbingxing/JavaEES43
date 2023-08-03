package com.tangbingxing.note.note7;

import java.util.TreeMap;

/**
 * @Classname Test7
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/24 21:28
 * @Created by m1346
 */

public class Test7 {
    public static void main(String[] args) {
        TreeMap<Student, String> students = new TreeMap<>();
        students.put(new Student("牛魔王",15),"NewYork");
        students.put(new Student("白骨精",15),"NewYourk");
        students.put(new Student("紫霞仙子",15),"NewYourk");

        students.forEach((k,v) -> System.out.println(k + " ->" + v));
    }
}
