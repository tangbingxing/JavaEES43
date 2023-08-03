package com.tangbingxing.homeWork.demo3;

import java.util.Collections;
import java.util.TreeSet;

/**
 * @Classname Test3_4
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 17:22
 * @Created by m1346
 */

public class Test3_4 {
    public static void main(String[] args) {
        //定义一个可以存储“整数”的LinkedHashSet对象
        TreeSet<Integer> set = new TreeSet<>();
        //  存储以下整数
        //20,30,50,10,30,20
        Integer[] nums = {20,30,50,10,30,20};
        Collections.addAll(set,nums);


        //  打印集合大小。为什么跟存入的数量不一致？
        //因为Set集合有去重复的特点，TreeSet需要指定排序规则，相同的元素不存，这样保证了元素的去重复性
        System.out.println(set.size());
        //  使用增强for遍历集合，打印大于25的元素
        for (Integer integer : set) {
            if (integer > 25) {
                System.out.println(integer);
            }
        }
    }
}
