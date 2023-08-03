package com.tangbingxing.homeWork.demo7;

import java.lang.reflect.Proxy;

/**
 * @Classname Test7
 * @Description 作业题7
 * @Version 1.0.0
 * @Date 2023/8/2 16:43
 * @Created by m1346
 */

public class Test7 {
    public static void main(String[] args) {
        //创建一个银行账户对象
        BankAccount account = new RealBankAccount();
        //创建一个银行账户代理对象
        BankAccount proxyAccount = (BankAccount) Proxy.newProxyInstance(
                account.getClass().getClassLoader(),
                account.getClass().getInterfaces(),
                new BankAccountProxy(account));

        // 存入 1000 元
        proxyAccount.deposit(1000);
        // 取出 200 元
        proxyAccount.withdraw(200);
        // 取出 600 元
        proxyAccount.withdraw(600);
        // 取出 300 元
        proxyAccount.withdraw(300);
        // 取出 350 元
        proxyAccount.withdraw(350);
        // 取出 250 元
        proxyAccount.withdraw(250);

        System.out.println("当前余额: ¥" + proxyAccount.getBalance());
    }
}
