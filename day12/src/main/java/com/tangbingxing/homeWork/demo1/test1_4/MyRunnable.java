package com.tangbingxing.homeWork.demo1.test1_4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname MyRunnable
 * @Description 自定义Runnable实现类，实现卖票功能,用Lock锁保证线程安全
 * @Version 1.0.0
 * @Date 2023/7/29 17:29
 * @Created by m1346
 */

public class MyRunnable implements Runnable{
    private int ticket = 100;//电影院的票

    //创建Lock锁对象
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        //模拟卖票过程
        while (true) {
            //加锁
            lock.lock();
            //如果有票
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ticket--;
                System.out.println(Thread.currentThread().getName() + "正在卖第"+ (100-ticket) +"张票，还剩" + ticket + "张");
            } else {
                //如果没票
                System.out.println(Thread.currentThread().getName() + "票已售空");
                break;
            }
            //释放锁
            lock.unlock();
        }
    }
}
