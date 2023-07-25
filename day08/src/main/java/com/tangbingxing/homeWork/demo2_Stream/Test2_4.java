package com.tangbingxing.homeWork.demo2_Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用Stream流的filter()方法筛选集合中所有的“张”姓学员；
 *  筛选后，获取前两个，并打印。
 *  重新获取Stream流，用filter()方法筛选出所有的“王”姓学员；
 *  筛选后，跳过前1个，打印剩余的人员。
 * @Classname Test2_4
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/24 20:06
 * @Created by m1346
 */

public class Test2_4 {
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

        //筛选集合中所有的“张”姓学员,筛选后，获取前两个，并打印
        list.stream().filter(name -> name.startsWith("张")).limit(2).forEach(System.out::println);

        //筛选出所有的“王”姓学员,筛选后，跳过前1个，打印剩余的人员
        list.stream().filter(name -> name.startsWith("王")).skip(1).forEach(System.out::println);
    }
}
