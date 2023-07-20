package com.tangbingxing.homeWork.demo9;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Classname Test9
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 10:41
 * @Created by m1346
 */

public class Test9 {
    public static void main(String[] args) {

    String start = "2020年03月01日 12:20";
    String end = "2022年05月22日 15:44";
    showInfo(start, end);
}
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm");

    public static String showInfo(String startTime, String endTime) {
        LocalDateTime start = LocalDateTime.parse(startTime, formatter);
        LocalDateTime end = LocalDateTime.parse(endTime, formatter);

        Duration d = Duration.between(start, end);
        if (d.isNegative()) {
            return null;
        }

        StringBuilder sb = new StringBuilder("共持续了");
        if (d.toDays() > 0) {
            sb.append(d.toDays()).append("天");
        }
        if (d.toHours() % 24 > 0) {
            sb.append(d.toHours() % 24).append("小时");
        }
        if (d.toMinutes() % 60 > 0) {
            sb.append(d.toMinutes() % 60).append("分钟");
        }
        System.out.println(sb);
        return sb.toString();
    }
}
