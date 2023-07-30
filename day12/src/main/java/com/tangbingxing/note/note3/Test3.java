package com.tangbingxing.note.note3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 通过ThreadPoolExecutor创建线程池,执行Runnable任务
 * @Classname Test3
 * @Description 笔记3
 * @Version 1.0.0
 * @Date 2023/7/29 20:24
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                5,
                10,
                1,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());
        //执行Runnable任务
        pool.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });
    }
}
