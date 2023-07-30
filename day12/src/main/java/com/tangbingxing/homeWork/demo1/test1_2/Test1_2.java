package com.tangbingxing.homeWork.demo1.test1_2;

/**
 * 使用同步代码块改写1.1的程序，保证运行结果的正确。
 * @Classname Test1_2
 * @Description 作业题1_2
 * @Version 1.0.0
 * @Date 2023/7/29 18:00
 * @Created by m1346
 */

public class Test1_2 {
    public static void main(String[] args) {
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
