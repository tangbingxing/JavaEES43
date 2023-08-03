package com.tangbingxing.homeWork.demo4;

import java.util.ArrayList;

/**
 * 通过增强`for`循环遍历集合
 * @Classname Test4
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/20 16:08
 * @Created by m1346
 */

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Go");
        list.add("Python");

        //通过增强for循环遍历集合
        for (String s : list) {
            System.out.println(s);
        }
    }

}
