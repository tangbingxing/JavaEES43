package com.tangbingxing.exam2_explain;

/**
 * @Classname Transportation
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/22 16:25
 * @Created by m1346
 */

public abstract class Transportation {
    private String id;
    private String model;
    private String name;

    public Transportation(String id, String model, String name) {
        this.id = id;
        this.model = model;
        this.name = name;
    }

    //运输方法
    public abstract void transportationWay();

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }
}
