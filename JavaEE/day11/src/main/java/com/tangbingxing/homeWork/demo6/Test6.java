package com.tangbingxing.homeWork.demo6;

/**
 * 请把继承和实现的方式 换成使用 匿名的方式创建出来子线程，并且在线程内部循环打印5次：努力，奋斗！
 * @Classname Test6
 * @Description 作业6
 * @Version 1.0.0
 * @Date 2023/7/28 16:50
 * @Created by m1346
 */

public class Test6 {
    public static void main(String[] args) {
        //匿名内部类方式
        //创建Thread对象
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + "努力，奋斗");
                }
            }
        });
        thread.setName("线程0");
        thread.start();

        //结合lambda表达式简化
        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "努力，奋斗");
            }
        });
        thread1.setName("线程1");
        thread1.start();
    }
}
