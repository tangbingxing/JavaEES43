package com.tangbingxing.note.note3;

import javax.annotation.processing.Completions;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 使用Arrays对整型数组默认规则排序
 * @Classname Test3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/24 17:56
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(300);
        list.add(500);
        list.add(400);
        list.add(200);

        //按默认规则排序
        Collections.sort(list);

        //打印输出
        list.forEach(System.out::println);
    }
}
