package com.tangbingxing.homeWork.demo2;

import java.util.concurrent.*;

/**
 * 定义测试类，和main()方法，使用线程池启动线程，并获取计算结果，并将结果打印到控制台。
 * @Classname Test2
 * @Description 题目2 测试类
 * @Version 1.0.0
 * @Date 2023/7/29 19:39
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) throws Exception{
        //创建实现类对象
        MyCallable mc = new MyCallable(100);
        //创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                5,
                30,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //使用线程池处理任务
        Future<?> future = pool.submit(mc);
        //打印返回结果
        System.out.println("1-100的累加和是: " + future.get());
    }
}
