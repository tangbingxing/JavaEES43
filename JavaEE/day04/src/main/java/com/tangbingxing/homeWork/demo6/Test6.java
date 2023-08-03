package com.tangbingxing.homeWork.demo6;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Classname Test6
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/17 18:04
 * @Created by m1346
 */

public class Test6 {
    public static void main(String[] args) {
        show("America/New_York");
    }

    //标准时间：2023年01月05日 10:49
    //当前时间：2023年01月05日 18:49
    //目标时间：2023年01月05日 05:49 [America/New_York]
    public static void show(String zoneIdStr) {
        //标准时间
        ZonedDateTime utcNow = ZonedDateTime.now(Clock.systemUTC());
        System.out.println("utcNow = " + utcNow);

        // 获取当前时间
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now = " + now);

        // 目标时间
        ZonedDateTime targetNow = ZonedDateTime.now(ZoneId.of(zoneIdStr));
        System.out.println("targetNow = " + targetNow);

        // 转换格式
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm");

        // 转换输出
        System.out.println("标准时间: " + dtf.format(utcNow));
        System.out.println("当前时间: " + dtf.format(now));
        System.out.println("目标时间: " + dtf.format(targetNow) + " [" + zoneIdStr + "]");

    }
}
