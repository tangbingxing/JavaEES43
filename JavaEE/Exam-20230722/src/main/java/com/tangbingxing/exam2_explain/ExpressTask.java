package com.tangbingxing.exam2_explain;

/**
 * @Classname ExpressTask
 * @Description 快递任务类
 * @Version 1.0.0
 * @Date 2023/7/22 16:41
 * @Created by m1346
 */

public class ExpressTask {
    private String expressNumber;//快递单号
    private double weight;//重量

    public ExpressTask(String expressNumber, double weight) {
        this.expressNumber = expressNumber;
        this.weight = weight;
    }

    public void sendBefore(){
        System.out.println("订单开始处理，仓库验货中。。。");
        System.out.println("货物重量："+weight+"kg");
        System.out.println("货物检验完毕!");
        System.out.println("货物填装完毕!");
        System.out.println("运货人已通知!");
        System.out.println("快递单号：" + expressNumber);
    };
    public void sending(Transportation t,Gps gps){
        System.out.println("运货人"+t.getName()+"正在驾驶编号为"+t.getId()+"的"+t.getModel()+"发送货物！");
        t.transportationWay();
        System.out.println("货物当前的坐标为：" + gps.getLocaltion());

    };
    public void sendAfter(Transportation t){
        System.out.println("货物运输任务已完成！");
        System.out.println("运货人"+t.getName()+"正在驾驶编号为"+t.getId()+"的"+t.getModel()+"已归还！");
        if (t instanceof Upkeep) {
            Upkeep uk = (Upkeep) t;
            uk.upkeep();
        }
    };

    public String getExpressNumber() {
        return expressNumber;
    }

    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
