package com.tangbingxing.homeWork.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * @Classname Test
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 17:38
 * @Created by m1346
 */

public class Test {
    public static void main(String[] args) {
        //ArrayList有以下元素: "a","f","b","c","a","d"，请用任意方式完成集合元素去重。去除集合中重复的元素。
        ArrayList<String> list = new ArrayList<>();
        String[] str = {"a","f","b","c","a","d"};
        Collections.addAll(list,str);
        //去重前
        System.out.println(list);
        LinkedHashSet<String> set = new LinkedHashSet<>(list);
        //去重后
        System.out.println(set);
    }
}
