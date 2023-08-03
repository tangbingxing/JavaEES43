package com.tangbingxing.homeWork.demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Classname Test2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 16:13
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        //  定义一个：键Integer，值String类型的HashMap集合
        HashMap<Integer, String> map = new HashMap<>();
        //  存储以下数据：
        //1，”张三”
        //2，“李四”
        //1，“王五”
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(1,"王五");
        //  打印集合大小；
        System.out.println(map.size());
        //  使用“键找值”的方式遍历集合，打印键和值；
        //1.获取所有键
        Set<Integer> keys = map.keySet();
        //2.遍历键
        for (Integer key : keys) {
            //3.通过get方法取到对应的值
            String value = map.get(key);
            System.out.println(key + "->" + value);
        }
        //  使用“键值对”的方式遍历集合，打印键和值；
        //1.获取所有键值对对象
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        //2.遍历所有的键值对对象
        for (Map.Entry<Integer, String> entry : entries) {
            //3.通过键值对对象取出对应的键和值
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "->" + value);
        }
        //  获取键为1的值，并打印
        System.out.println(map.get(1));
        //  获取键为10的值，并打印
        System.out.println(map.get(10));
        //  判断集合中是否有键：10
        System.out.println(map.containsKey(10));
        //  删除键为1的键值对，删除完毕打印集合
        map.remove(1);
        System.out.println(map);
    }
}
