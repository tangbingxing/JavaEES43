package com.tangbingxing.note.note1;

/**
 * 同步方法
 * @Classname Test1_2
 * @Description 笔记1_2
 * @Version 1.0.0
 * @Date 2023/7/29 20:25
 * @Created by m1346
 */

public class Test1_2 extends Thread{
    private double takeMoney;//取钱金额
    private Account account;//要操作的账户对象

    public Test1_2(double takeMoney, Account account,String name) {
        super(name);
        this.takeMoney = takeMoney;
        this.account = account;
    }

    @Override
    public void run() {
        //调用取钱方法
        takeMoney(account,takeMoney);
    }


    private synchronized static void takeMoney(Account account,double takeMoney) {
        //定义一个变量，接收账户里的余额
        double money = account.getMoney();
        //取钱操作
        if (money >= takeMoney) {
            //如果余额足够，则取钱成功
            System.out.println(Thread.currentThread().getName() + "取钱成功!");
            money -= takeMoney;
            account.setMoney(money);
            System.out.println("余额还有 " + money + "元");
        } else {
            //如果余额不足，则取钱失败
            System.out.println(Thread.currentThread().getName() + "余额不足，取钱失败!");
        }
    }
}
