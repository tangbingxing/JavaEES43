package com.tangbingxing.exam2;

/**
 * @Classname Vehicle
 * @Description 交通工具类
 * @Version 1.0.0
 * @Date 2023/7/22 9:52
 * @Created by m1346
 */

public abstract class Vehicle {
    //编号
     protected String id;
     //型号
    protected String model;
    //运货负责人
    protected String name;

    public Vehicle(String id, String model, String name) {
        this.id = id;
        this.model = model;
        this.name = name;
    }

    //运输方法
     abstract void traffic(String state);
}
