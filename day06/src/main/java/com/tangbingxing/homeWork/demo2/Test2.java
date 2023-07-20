package com.tangbingxing.homeWork.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Classname Test2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/20 16:06
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        String[] arg = {"测试数据1","测试数据2","测试数据3"};
        run(arg);
    }
    public static void run(String[] args) {
        Collection<String> c = new ArrayList<>(Arrays.asList(args));

        // 判断集合是否为空 是空返回true,反之。
        System.out.println(c.isEmpty());

        // 添加一个元素d
        c.add("d");

        // 获取集合的大小。
        System.out.println(c.size());

        // 判断集合中是否包含某个元素。
        System.out.println(c.contains("d"));

        // 删除某个元素:如果有多个重复元素默认删除前面的第一个！
        System.out.println(c.remove("d"));

        // 把集合转换成数组
        String[] array = c.toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        // 清空集合的元素。
        c.clear();

        System.out.println("--------------------------------------------");
        // 把一个集合的全部数据倒入到另一个集合中去。
        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        c1.add("Java");
        c1.add("C++");
        c1.add("Go");
        c1.add("Python");
        c2.addAll(c1);
        System.out.println(c2);

        // 把c2集合的全部数据倒入到c集合中去。
        c.addAll(c2);
        System.out.println(c);

    }
}
