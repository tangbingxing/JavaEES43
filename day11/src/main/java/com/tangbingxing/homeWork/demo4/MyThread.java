package com.tangbingxing.homeWork.demo4;

/**
 * @Classname MyThread
 * @Description Thread自定义子类
 * @Version 1.0.0
 * @Date 2023/7/28 16:47
 * @Created by m1346
 */

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("努力，奋斗");
        }
    }
}
