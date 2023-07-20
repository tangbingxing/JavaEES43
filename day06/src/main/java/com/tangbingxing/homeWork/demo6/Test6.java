package com.tangbingxing.homeWork.demo6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Classname Test6
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/20 16:09
 * @Created by m1346
 */

public class Test6 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(args));
        if (list.size() == 0) {
            list.add("蜘蛛精");
            list.add("至尊宝");
            list.add("至尊宝");
            list.add("牛夫人");
        }

        // 在某个索引位置插入元素。（在索引为2的位置插入“紫霞仙子”）
        list.add(2,"紫霞仙子");


        // 根据索引删除元素,返回被删除元素（删除索引为2的元素）
        list.remove(2);

        // 返回集合中指定位置的元素。（返回索引为3的元素）
        System.out.println(list.get(3));


        // 改索引位置处的元素,修改成功后，会返回原来的数据（将索引为3位置的元素改为牛魔王）
        list.set(3,"牛魔王");

    }
}
