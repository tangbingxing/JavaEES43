package com.tangbingxing.homeWork.demo2_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 定义一个Person类，包含一个属性：姓名(String)
 * 	 	定义无参、全参构造方法
 * 		定义get/set方法
 * 	2.定义main()方法，按依稀顺序编写程序：
 *  定义集合`List<String>`，添加以下数据：
 * 		“王佳乐”
 * 		“张三丰”
 * 		“王思聪”
 * 		“张飞”
 *  使用Stream流的map()方法，将每个元素封装为一个Person对象。
 *  将新流中的元素提取为List集合。
 *  遍历、打印集合中所有的Person对象信息。
 * @Classname Test2_6
 * @Description 作业题2_6
 * @Version 1.0.0
 * @Date 2023/7/24 20:23
 * @Created by m1346
 */

public class Test2_6 {
    public static void main(String[] args) {
        //创建List集合
        List<String> list = new ArrayList<>();
        //添加数据到集合中
        list.add("王佳乐");
        list.add("张三丰");
        list.add("王思聪");
        list.add("张飞");

        //将每个元素封装为一个Person对象;将新流中的元素提取为List集合
        List<Person> list2 = list.stream().map(name -> new Person(name)).collect(Collectors.toList());
        //遍历、打印集合中所有的Person对象信息
        list2.forEach(System.out::println);
    }
}
