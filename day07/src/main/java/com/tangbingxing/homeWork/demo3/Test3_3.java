package com.tangbingxing.homeWork.demo3;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * @Classname Test3_3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 17:11
 * @Created by m1346
 */

public class Test3_3 {
    public static void main(String[] args) {
        //定义一个可以存储“整数”的LinkedHashSet对象
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        //  存储以下整数
        //20,30,50,10,30,20
        Integer[] nums = {20,30,50,10,30,20};
        Collections.addAll(set,nums);

        //  打印集合大小。为什么跟存入的数量不一致？
        //因为Set集合有去重复的特点，HashSet底层基于哈希表存储数据，会根据hashCode来确定元素位置，如果发生哈希碰撞，hashCode相同的元素还会再用equals方法进行比较。
        System.out.println(set.size());
        //  使用增强for遍历集合，打印大于25的元素
        for (Integer integer : set) {
            if (integer > 25) {
                System.out.println(integer);
            }
        }
    }
}
