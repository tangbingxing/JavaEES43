package com.tangbingxing.note.note4;

import java.util.concurrent.*;

/**
 * 通过ThreadPoolExecutor创建线程池,执行Callable任务
 * @Classname Test4
 * @Description 笔记4
 * @Version 1.0.0
 * @Date 2023/7/29 20:24
 * @Created by m1346
 */

public class Test4 {
    public static void main(String[] args) throws Exception{
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5,
                10,
                30,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(5),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy());

        Future<Integer> sum = pool.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1; i < 11; i++) {
                    sum += i;
                }
                return sum;
            }
        });
        System.out.println("1-10的和为 " + sum.get());
    }
}
