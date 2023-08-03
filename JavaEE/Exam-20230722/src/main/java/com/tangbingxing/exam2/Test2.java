package com.tangbingxing.exam2;

/**
 * 编写一个模拟物流快递系统的程序，模拟后台系统处理货物的过程。
 * 运行结果如下:
 * 订单开始处理，仓库验货中。。。
 * 货物重量：75.34kg
 * 货物检验完毕!
 * 货物填装完毕!
 * 运货人已通知!
 * 快递单号：HYX500236
 * ======================
 * 运货人小黑正在驾驶编号为Z035的宾利发送货物！
 * 运输进行中。。。
 * 货物当前的坐标为：193,485
 * ======================
 * 货物运输任务已完成！
 * 运货人小黑所驾驶的编号为Z035的宾利已归还！
 * 货物运输车辆保养完毕!
 * @Classname Test2
 * @Description 测试类
 * @Version 1.0.0
 * @Date 2023/7/22 9:50
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        //创建一个快递包裹
        Expressage expressage = new Expressage("HYX500236", 75.34);
        //运输前检查记录
        expressage.sendBefore();
        //创建一辆运输车运输货物
        Truck truck = new Truck("Z035", "宾利", "小黑");
        //运输前检查记录
        expressage.send(truck);
        //运输前检查记录
        expressage.sendAfter(truck);
    }
}
