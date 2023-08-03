package com.tangbingxing.exam2;

/**
 * @Classname Expressage
 * @Description 快递任务类
 * @Version 1.0.0
 * @Date 2023/7/22 10:26
 * @Created by m1346
 */

public class Expressage {
    //快递单号
    private String id;
    //货物重量
    private double weight;

    public Expressage(String id, double weight) {
        this.id = id;
        this.weight = weight;
    }

    //运输前
    public void sendBefore(){
        System.out.println("订单开始处理，仓库验货中。。。");
        System.out.println("货物重量：" + weight + "kg");
        System.out.println("货物检验完毕!");
        System.out.println("货物填装完毕!");
        System.out.println("运货人已通知!");
        System.out.println("快递单号：" + id);
        System.out.println("======================");
    }

    //运输时
    public void send(Truck truck){
        truck.traffic("start");
        System.out.println("======================");
    };
    //运输后
    public void sendAfter(Truck truck){
        truck.traffic("end");
        truck.maintain();
        System.out.println("======================");
    };
}
