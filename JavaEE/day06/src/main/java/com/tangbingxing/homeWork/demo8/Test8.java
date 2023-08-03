package com.tangbingxing.homeWork.demo8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Classname Test8
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/20 16:10
 * @Created by m1346
 */

public class Test8 {

    public static void main(String[] args) {

        //创建Collection集合
        Collection<String> list = new ArrayList<String>();

        //添加元素到集合
        list.add("JavaEE企业级开发指南");
        list.add("Oracle高级编程");
        list.add("MySQL从入门到精通");
        list.add("Java架构师之路");

        System.out.println("使用迭代器遍历所有元素，并打印");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；");
        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            String next = iterator1.next();
            if (next.length() < 10) {
                System.out.println(next);
            }
        }

        System.out.println("使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印");
        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            String next = iterator2.next();
            if (next.contains("Java")) {
                System.out.println(next);
            }
        }

        System.out.println("如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。");
        Iterator<String> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            String next = iterator3.next();
            if (next.contains("Oracle")) {
                iterator3.remove();
            }else{
                System.out.println(next);
            }
        }
    }
}
