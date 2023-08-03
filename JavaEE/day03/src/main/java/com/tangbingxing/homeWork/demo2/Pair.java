package com.tangbingxing.homeWork.demo2;

/**
 * @Classname Pair
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/14 17:46
 * @Created by m1346
 */

public class Pair<T,K> {
    //定义成员变量
    private T first;
    private K second;

    //空参构造器
    private Pair() {
    }


    //有参构造器
    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    //成员方法
    public static <T,K> Pair<T,K> of(T first,K second){
        Pair<T, K> pair = new Pair<>(first, second);
        return pair;
    }

    //get方法
    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }
}
