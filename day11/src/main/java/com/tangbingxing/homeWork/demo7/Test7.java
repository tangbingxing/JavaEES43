package com.tangbingxing.homeWork.demo7;

import java.util.concurrent.FutureTask;

/**
 * 请开启一个子线程，并且在子线程内部计算1+2...+10 的和，并且返回结果到主线程打印
 * @Classname Test7
 * @Description 作业题7
 * @Version 1.0.0
 * @Date 2023/7/28 17:15
 * @Created by m1346
 */

public class Test7 {
    public static void main(String[] args) throws Exception {
        //创建Callable实现类MyCallable的对象
        MyCallable mc = new MyCallable(10);
        //创建Future实现类FutureTask的对象
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建Thread对象
        Thread thread = new Thread(ft);
        //开启线程
        thread.start();
        //获取线程执行后的返回结果
        Integer sum = ft.get();
        //打印输出
        System.out.println("1-10的和为" + sum);
    }
}
