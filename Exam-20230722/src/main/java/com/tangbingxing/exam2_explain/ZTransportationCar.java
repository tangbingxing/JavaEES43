package com.tangbingxing.exam2_explain;

/**
 * @Classname ZTransportationCar
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/22 16:25
 * @Created by m1346
 */

public class ZTransportationCar extends Transportation implements Upkeep{

    public ZTransportationCar(String id, String model, String name) {
        super(id, model, name);
    }

    @Override
    public void transportationWay() {
        System.out.println("运输进行中。。。");
    }

    @Override
    public void upkeep() {
        System.out.println("货物运输车辆保养完毕!");
    }
}
