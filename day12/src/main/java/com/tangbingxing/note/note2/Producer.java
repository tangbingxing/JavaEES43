package com.tangbingxing.note.note2;

/**
 * @Classname Producer
 * @Description 生产者
 * @Version 1.0.0
 * @Date 2023/7/30 10:40
 * @Created by m1346
 */

public class Producer extends Thread{

    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 1;//记录包子个数
        while (true) {
            synchronized (Test2.lock) {
                //模拟生产者生产包子
                //判断有没有包子,即flag值为true还是false
                if (!Test2.flag) {
                    //为false,表示没有包子,则生产包子
                    System.out.println(Thread.currentThread().getName() + "正在做第" + (i++) + "个包子");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("包子做好了");
                    Test2.flag = true;
                }
                //为true,或者包子做好了,则表示有包子,唤醒消费者吃包子
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
