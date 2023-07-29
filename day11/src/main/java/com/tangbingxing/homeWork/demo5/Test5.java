package com.tangbingxing.homeWork.demo5;

/**
 * 请使用实现的方式创建出一条子线程，并且在线程内部循环打印5次：努力，奋斗！
 * @Classname Test5
 * @Description 作业5
 * @Version 1.0.0
 * @Date 2023/7/28 16:54
 * @Created by m1346
 */

public class Test5 {
    public static void main(String[] args) {
        //创建Runnable实现类
        MyRunnable mr = new MyRunnable();
        //创建Thread对象
        Thread thread = new Thread(mr);
        //启动线程
        thread.start();
    }
}
