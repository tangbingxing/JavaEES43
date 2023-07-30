package com.tangbingxing.note.note2;

/**
 * 使用等待唤醒完成吃包子和生产包子案例
 * @Classname Test2
 * @Description 笔记2 测试类
 * @Version 1.0.0
 * @Date 2023/7/29 20:24
 * @Created by m1346
 */

public class Test2 {
    //定义旗帜变量
    public static boolean flag = false;

    //创建锁对象
    public static final Object lock = new Object();

    public static void main(String[] args) {
        //创建并启动生产者线程
        new Producer("生产者").start();

        //创建并启动消费者线程
        new Consumer("消费者").start();


    }
}
