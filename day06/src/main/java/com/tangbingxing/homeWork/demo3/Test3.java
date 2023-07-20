package com.tangbingxing.homeWork.demo3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 通过迭代器`Iterator`遍历集合
 * @Classname Test3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/20 16:08
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Go");
        list.add("Python");

        //通过迭代器Iterator遍历集合
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
