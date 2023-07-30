package com.tangbingxing.note.note2;

/**
 * @Classname Consumer
 * @Description 消费者
 * @Version 1.0.0
 * @Date 2023/7/30 10:40
 * @Created by m1346
 */

public class Consumer extends Thread {

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 1;//记录包子个数
        while (true) {
            synchronized (Test2.lock){
                //模拟消费者吃包子
                //判断有没有包子,即flag值为true还是false
                if (Test2.flag) {
                    //有包子,则吃包子
                    System.out.println(Thread.currentThread().getName() + "正在吃第" + (i++) + "个包子");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //吃完包子唤醒生产者生产
                    System.out.println("包子吃完了");
                    Test2.flag = false;
                }
                //没有包子,或者包子吃完了,则唤醒生产者生产包子
                Test2.lock.notifyAll();
                //自己进入无限等待,直到被唤醒
                try {
                    Test2.lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
