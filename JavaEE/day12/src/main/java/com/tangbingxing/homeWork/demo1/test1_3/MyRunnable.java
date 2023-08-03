package com.tangbingxing.homeWork.demo1.test1_3;

/**
 * @Classname MyRunnable
 * @Description 自定义Runnable实现类，实现卖票功能,用同步方法保证线程安全
 * @Version 3.0.0
 * @Date 2023/7/29 17:29
 * @Created by m1346
 */

public class MyRunnable implements Runnable{
    private int ticket = 100;//电影院的票

    @Override
    public void run() {
        //模拟卖票过程
        while (true) {
            if (sellTicket()) {
                break;
            }
        }
    }

    //使用同步方法保证线程安全
    public synchronized boolean sellTicket() {
        //如果有票
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + "正在卖第"+ (100-ticket) +"张票，还剩" + ticket + "张");
            return false;
        } else {
            //如果没票
            System.out.println(Thread.currentThread().getName() + "票已售空");
            return true;
        }
    }
}
