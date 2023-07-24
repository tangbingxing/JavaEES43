package com.tangbingxing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * @Classname testMap
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 20:14
 * @Created by m1346
 */

public class testMap {
    public static void main(String[] args) {
        Random random = new Random();
        //定义一个数组存储4个景点
        String[] point = {"A","B","C","D"};
        ArrayList<String> list = new ArrayList<>();
        //采取随机数模拟生成80个不同景点选择，并将其存入list集合中
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(point.length);
            list.add(point[index]);
        }
        //遍历集合
        //使用map集合统计景点出现的次数
        HashMap<String,Integer> map = new HashMap<>();

        for (String s : list) {
            //最后输出map集合，统计每个景点的投票数
            if (map.containsKey(s)) {
                //若集合中 有该景点，则值加1
                map.put(s,map.get(s) + 1);
            } else {
                // 若没出现过该景点，则存入景点，并设置值为1
                map.put(s,1);
            }
        }
        System.out.println(map);
    }
}
