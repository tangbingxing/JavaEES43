package com.tangbingxing.homeWork.demo1;

/**
 * @Classname Test1
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/17 16:15
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        printTime("HelloWord",10000);
    }

    private static void printTime(String s,int times) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            System.out.println(s + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时: " + (end - start) + "ms");
    }
}
