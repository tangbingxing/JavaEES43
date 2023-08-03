package com.tangbingxing.homeWork.demo4;

/**
 * 请使用继承的方式创建出一条子线程，并且在线程内部循环打印5次：努力，奋斗！
 * @Classname Test5
 * @Description 作业题4
 * @Version 1.0.0
 * @Date 2023/7/28 16:46
 * @Created by m1346
 */

public class Test4 {
    public static void main(String[] args) {
        //创建Thread的子类对象
        MyThread mt = new MyThread();
        //调用start方法开启线程
        mt.start();
    }
}
