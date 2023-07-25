package com.tangbingxing.note.note1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 需求
 *  小贾下单并付款的时间为：2023年11月11日 0:01:18
 *  小皮下单并付款的时间为：2023年11月11日 0:10:51
 *  请用代码说明这两位同学有没有参加上秒杀活动？
 * @Classname Test1
 * @Description 使用jdk8之前的日期类实现秒杀活动案例
 * @Version 1.0.0
 * @Date 2023/7/24 17:55
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {

        // 1.定义4个String变量,存储小贾,小皮的下单时间和秒杀开始,结束时间
        String xj = "2023年11月11日 00:01:18";
        String xp = "2023年11月11日 00:10:51";
        String start = "2023年11月11日 00:00:00";
        String end = "2023年11月11日 00:10:00";

        // 2.创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        try {
            // 3.把String时间---Date时间
            Date xjDate = sdf.parse(xj);
            Date xpDate = sdf.parse(xp);
            Date startDate = sdf.parse(start);
            Date endDate = sdf.parse(end);

            // 4.获取下单时间距离标准时间的毫秒值
            long xjDateTime = xjDate.getTime();
            long xpDateTime = xpDate.getTime();
            long startDateTime = startDate.getTime();
            long endDateTime = endDate.getTime();

            // 5.比较判断
            if (xjDateTime >= startDateTime && xjDateTime <= endDateTime){
                System.out.println("小贾秒杀成功!");
            }else{
                System.out.println("小贾秒杀失败!");
            }

            if (xpDateTime >= startDateTime && xpDateTime <= endDateTime){
                System.out.println("小皮秒杀成功!");
            }else{
                System.out.println("小皮秒杀失败!");
            }
        } catch (ParseException e) {
            System.out.println("e = " + e);
        }

    }
}
