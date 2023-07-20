package com.tangbingxing.homeWork.demo5;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 通过`Lambda`表达式遍历集合
 * @Classname Test5
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/20 16:09
 * @Created by m1346
 */

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Go");
        list.add("Python");

        //匿名内部类
        /*list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //可简化 Lambda表达式遍历集合
        /*list.forEach((String s)->{
            System.out.println(s);
        });*/

        //可进一步简化 方法引用
        list.forEach(System.out::println);


    }
}
