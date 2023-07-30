package com.tangbingxing.homeWork.demo1.test1;

/**
 * 请编写程序，不使用任何同步技术，模拟三个窗口同时卖100张票的情况，运行并打印结果，观察到错误的数据，并解释出现错误的原因。
 * @Classname Test1
 * @Description 作业题1_1
 * @Version 1.0.0
 * @Date 2023/7/29 17:25
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        //创建Runnable实现类对象
        MyRunnable mr = new MyRunnable();
        //模拟3个窗口卖票情况
        Thread thread1 = new Thread(mr,"窗口一");
        Thread thread2 = new Thread(mr,"窗口二");
        Thread thread3 = new Thread(mr,"窗口三");

        //启动3个线程
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
