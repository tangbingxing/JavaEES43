package com.tangbingxing.homeWork.demo2_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 先筛选出所有的“张”姓学员；
 *  再筛选出所有的“王”姓学员；
 *  将两个流合并为一个流
 *  打印合并后的每个元素。
 * @Classname Test2_5
 * @Description 作业题2_5
 * @Version 1.0.0
 * @Date 2023/7/24 20:14
 * @Created by m1346
 */

public class Test2_5 {
    public static void main(String[] args) {
        //创建List集合
        List<String> list = new ArrayList<>();
        //添加数据到集合中
        list.add("张三丰");
        list.add("王思聪");
        list.add("张飞");
        list.add("刘晓敏");
        list.add("张靓颖");
        list.add("王敏");

        //先筛选出所有的“张”姓学员；再筛选出所有的“王”姓学员；将两个流合并为一个流,打印合并后的每个元素
        Stream.concat(list.stream().filter(name -> name.startsWith("张")),list.stream().filter(name -> name.startsWith("李"))).forEach(System.out::println);
    }
}
