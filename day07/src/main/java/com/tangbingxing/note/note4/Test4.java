package com.tangbingxing.note.note4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的三种遍历方式
 * @Classname Test4
 * @Description 笔记4
 * @Version 1.0.0
 * @Date 2023/7/25 16:35
 * @Created by m1346
 */

public class Test4 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Tom");
        map.put(2,"Cadi");
        map.put(3,"Jack");

        //方式一:键找值
        //先获取集合中所有的键
        Set<Integer> integers = map.keySet();
        //再遍历键，根据键找值
        for (Integer integer : integers) {
            System.out.println(integer + " -> " + map.get(integer));
        }
        System.out.println("=========");

        //方式二:键值对对象
        //先获取所有的键值对对象
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        //遍历键值对对象,通过对象获取对应的键和值
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() +" -> "+ entry.getValue());
        }
        System.out.println("=========");

        //方式三:forEach方法结合lambda表达式遍历
        map.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
