package com.tangbingxing.homeWork.demo3;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Classname Test3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 16:24
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
        //定义一个Set集合，并存储以下数据：
        //刘备，关羽，张飞，刘备，张飞
        HashSet<String> set = new HashSet<>();
        set.add("刘备");
        set.add("关羽");
        set.add("张飞");
        set.add("刘备");
        set.add("张飞");
        //  打印集合大小
        System.out.println("数组大小" + set.size());
        //  使用迭代器遍历集合，并打印每个元素
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }

        System.out.println("---------");
        //  使用增强for遍历集合，并打印每个元素
        for (String s : set) {
            System.out.println(s);
        }
    }
}
