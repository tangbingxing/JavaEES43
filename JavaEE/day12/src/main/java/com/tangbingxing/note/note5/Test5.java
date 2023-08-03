package com.tangbingxing.note.note5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用Executors工具类创建线程池执行任务
 * @Classname Test5
 * @Description 笔记5
 * @Version 1.0.0
 * @Date 2023/7/29 20:24
 * @Created by m1346
 */

public class Test5 {
    public static void main(String[] args) {
        //使用Executors工具类创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        //使用线程池执行Runnable任务
        pool.execute(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
    }
}
