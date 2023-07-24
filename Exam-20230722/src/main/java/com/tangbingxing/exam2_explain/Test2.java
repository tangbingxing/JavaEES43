package com.tangbingxing.exam2_explain;

/**
 * @Classname Test2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/22 16:22
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        //准备快递
        ExpressTask et = new ExpressTask("HYX500236",75.34);

        //准备运输车辆
        Transportation ts = new ZTransportationCar("Z035","宾利","小黑");

        //准备定位系统
        Gps gps = new Phone();

        //前
        et.sendBefore();
        System.out.println("======================");

        //中
        et.sending(ts,gps);
        System.out.println("======================");

        //后
        et.sendAfter(ts);
        System.out.println("======================");
    }
}
