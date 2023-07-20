package com.tangbingxing.homeWork.demo2;

/**
 * @Classname Test2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/14 17:46
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = Pair.of("hello", 123);
        System.out.println("pair.getFirst() = " + pair.getFirst());
        System.out.println("pair.getSecond() = " + pair.getSecond());
    }
}
