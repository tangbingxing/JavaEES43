package com.tangbingxing.homeWork.demo3;

/**
 * @Classname Item
 * @Description 自定义商品类
 * @Version 1.0.0
 * @Date 2023/7/28 19:50
 * @Created by m1346
 */

public class Item {
    private String name;//商品名称
    private int number;//购买数量
    private double price;//商品单价金额

    public Item() {
    }

    public Item(String name, int number, double price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n商品名称:" + name +
                "\t购买数量:" + number +
                "\t商品单价金额:" + price +
                "\n";
    }
}
