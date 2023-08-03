package com.tangbingxing.homeWork.demo7;

/**
 * @Classname BankAccount
 * @Description 银行账号接口类
 * @Version 1.0.0
 * @Date 2023/8/2 16:44
 * @Created by m1346
 */

public interface BankAccount {

    /**
     * 存入指定金额
     * @param amount
     */
    public void deposit(double amount);

    /**
     * 取出指定金额
     * @param amount
     */
    public void withdraw(double amount);

    /**
     * 获取当前余额
     * @return
     */
    public double getBalance();
}
