package com.tangbingxing.homeWork.demo7;

/**
 * @Classname RealBankAccount
 * @Description 银行账户实现类
 * @Version 1.0.0
 * @Date 2023/8/2 16:44
 * @Created by m1346
 */

public class RealBankAccount implements BankAccount {
    // 余额
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("提现 "+amount+" 成功!");
        } else {
            System.out.println("提现 "+amount+" 失败，资金不足，当前余额 "+balance);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
