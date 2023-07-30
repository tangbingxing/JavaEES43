package com.tangbingxing.homeWork.demo2;

import java.util.concurrent.Callable;

/**
 * 定义一个线程类，实现Callable接口。此线程可以计算1--100的所有数字的累加和
 * @Classname MyCallable
 * @Description 自定义Callable实现类 计算1--n所有数字的累加和
 * @Version 1.0.0
 * @Date 2023/7/29 19:40
 * @Created by m1346
 */

public class MyCallable implements Callable<Integer> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }
        return sum;
    }
}
