package com.tangbingxing.homeWork.demo3;

import java.util.ArrayList;

/**
 * @Classname Order
 * @Description 自定义订单类
 * @Version 1.0.0
 * @Date 2023/7/28 19:50
 * @Created by m1346
 */

public class Order {
    private String data;//下单日期
    private String name;//收件人名称
    private String address;//收件人地址
    private ArrayList<Item> items;//商品

    public Order() {
    }

    public Order(String data, String name, String address, ArrayList<Item> items) {
        this.data = data;
        this.name = name;
        this.address = address;
        this.items = items;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "订单\n" +
                "下单日期:" + data +
                "\n收件人名称:" + name +
                "\n收件人地址:" + address +
                "\n商品\n" + items;
    }
}
