package com.tangbingxing.homeWork.demo4;

import java.time.LocalDateTime;

/**
 * @Classname Test4
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/17 17:19
 * @Created by m1346
 */

public class Test4 {
    public static void main(String[] args) {
        String xz = "小张",xj = "小贾",xp = "小皮";
        LocalDateTime xzTime = LocalDateTime.of(2023, 11, 10, 11, 55, 26);
        LocalDateTime xjTime = LocalDateTime.of(2023, 11, 11, 0, 1, 18);
        LocalDateTime xpTime = LocalDateTime.of(2023, 11, 11, 0, 10, 51);

        compareTime(xz,xzTime);
        compareTime(xj,xjTime);
        compareTime(xp,xpTime);
    }

    private static void compareTime(String s, LocalDateTime time) {
        LocalDateTime startTime = LocalDateTime.of(2023, 11, 11, 0, 0, 0);

        LocalDateTime endTime = LocalDateTime.of(2023, 11, 11, 0, 10, 0);

        if (time.isAfter(startTime) && time.isBefore(endTime)) {
            System.out.println(s + " 秒杀成功了");
        } else System.out.println(s + " 秒杀失败了");
    }
}
