package com.tangbingxing.homeWork.demo1;

import java.util.*;

/**
 * @Classname Test1
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 16:02
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {

//    定义一个可以存储“整数”的集合，并存储一些数据。
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(9);
        list.add(5);

//      对集合中的数据打乱顺序；
        Collections.shuffle(list);
//              打印集合
        System.out.println(list);
//              对集合中的数据进行升序排序
        Collections.sort(list);
//              打印集合
        System.out.println(list);
//              对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
        Collections.sort(list,(i1,i2)->i2.compareTo(i1));
        //Collections.sort(list, Comparator.reverseOrder());
//              打印集合
        System.out.println(list);
    }
}

