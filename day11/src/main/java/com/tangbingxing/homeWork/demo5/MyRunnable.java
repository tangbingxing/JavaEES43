package com.tangbingxing.homeWork.demo5;

/**
 * @Classname MyRunnable
 * @Description Runnable自定义实现类
 * @Version 1.0.0
 * @Date 2023/7/28 17:00
 * @Created by m1346
 */

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("努力，奋斗");
        }
    }
}
