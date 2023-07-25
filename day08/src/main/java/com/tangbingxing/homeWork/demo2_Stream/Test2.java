package com.tangbingxing.homeWork.demo2_Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义集合`List<String>`，添加以下数据：
 * 		“张三丰”
 * 		“王思聪”
 * 		“张飞”
 * 		“刘晓敏”
 * 		“张靓颖”
 *  使用Stream流的forEach()方法打印集合的所有元素
 * @Classname Test2
 * @Description 作业2_1
 * @Version 1.0.0
 * @Date 2023/7/24 19:30
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        //创建List集合
        List<String> list = new ArrayList<>();
        //添加数据到集合中
        list.add("张三丰");
        list.add("王思聪");
        list.add("张飞");
        list.add("刘晓敏");
        list.add("张靓颖");

        //使用stream流的forEach()方法打印集合的所有元素
        list.stream().forEach(System.out::println);
    }
}
