package com.tangbingxing.exam2;

/**
 * @Classname Truck
 * @Description 货物运输车类
 * @Version 1.0.0
 * @Date 2023/7/22 10:15
 * @Created by m1346
 */

public class Truck extends Vehicle implements Maintenance{
    public Truck(String id, String model, String name) {
        super(id, model, name);
    }

    //保养
    @Override
    public void maintain() {
        System.out.println("货物运输车辆保养完毕!");
    }

    @Override
    void traffic(String state) {
        if (state.equals("start")) {
            //运输开始
            System.out.println("运货人" + name + "所驾驶的编号为" + id  + "的" + model + "发送货物！");
            System.out.println("运输进行中。。。");
            new Phone().position(193,485);
        } else if (state.equals("end")) {
            //运输完成
            System.out.println("货物运输任务已完成！");
            System.out.println("运货人" + name + "所驾驶的编号为" + id  + "的" + model + "已归还！");
        }
    }
}
