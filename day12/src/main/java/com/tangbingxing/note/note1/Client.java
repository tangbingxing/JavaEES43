package com.tangbingxing.note.note1;

/**
 * @Classname Client
 * @Description 测试类
 * @Version 1.0.0
 * @Date 2023/7/29 20:27
 * @Created by m1346
 */

public class Client {
    public static void main(String[] args) {
        //创建一个共同账户，里面有10万余额
        Account account = new Account("ICBC-111", 100000);

        //同步代码块
        //test1(account);

        //同步方法
        //test2(account);

        //Lock锁
        test3(account);

    }

    private static void test1(Account account) {
        //创建线程对象
        Thread thread1 = new Test1(100000, account,"小明");
        Thread thread2 = new Test1(100000, account,"小红");

        //启动线程
        thread1.start();
        thread2.start();
    }

    private static void test2(Account account) {
        //创建线程对象
        Thread thread1 = new Test1_2(100000, account,"小明");
        Thread thread2 = new Test1_2(100000, account,"小红");

        //启动线程
        thread1.start();
        thread2.start();
    }

    private static void test3(Account account) {
        //创建线程对象
        Thread thread1 = new Test1_3(100000, account,"小明");
        Thread thread2 = new Test1_3(100000, account,"小红");

        //启动线程
        thread1.start();
        thread2.start();
    }
}
