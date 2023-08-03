package com.tangbingxing.note.note4;

/**
 * 通过继承Thread类实现多线程
 * @Classname Test4
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/28 21:26
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
