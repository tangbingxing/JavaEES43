package com.tangbingxing.homeWork.demo7;

import java.util.concurrent.Callable;

/**
 * @Classname MyCallable
 * @Description Callable自定义实现类
 * @Version 1.0.0
 * @Date 2023/7/28 17:18
 * @Created by m1346
 */

public class MyCallable implements Callable<Integer> {
    int n;//从0开始要累加的次数

    public MyCallable(int n) {
        this.n = n;
    }

    /**
     * 计算1-n的累加和
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        int sum = 0;//累加和
        for (int i = 0; i < n; i++) {
            sum  += i;
        }
        return sum;
    }
}
