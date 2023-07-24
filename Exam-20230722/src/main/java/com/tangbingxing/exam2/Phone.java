package com.tangbingxing.exam2;

/**
 * @Classname Phone
 * @Description 手机类  实现定位功能
 * @Version 1.0.0
 * @Date 2023/7/22 10:09
 * @Created by m1346
 */

public class Phone implements GPS{
    @Override
    public void position(int x,int y) {
        System.out.println("货物当前的坐标为:" + x + "," + y );
    }
}
