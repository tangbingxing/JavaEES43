package com.tangbingxing.note.note1;

/**
 * @Classname Account
 * @Description 自定义账户类
 * @Version 1.0.0
 * @Date 2023/7/29 20:27
 * @Created by m1346
 */

public class Account {
    private String id;//账户ID
    private double money; //账户金额

    public Account(String id, double money) {
        this.id = id;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", money=" + money +
                '}';
    }
}
