package com.tangbingxing.homeWork.demo7;

import java.time.Duration;
import java.time.Instant;

/**
 * @Classname Test7
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/17 18:21
 * @Created by m1346
 */

public class Test7 {
    public static void main(String[] args) {
        // 目标时间
        Instant target = Instant.now().plus(Duration.ofDays(55));

        System.out.println(isAfterTarget(50, target));
        System.out.println(isAfterTarget(70, target));
    }

    public static boolean isAfterTarget(int n, Instant target) {
        // 获取当前时间
        Instant now = Instant.now();

        // 当前时间加上n天
        Instant plus = now.plus(Duration.ofDays(n));

        // 判断,返回
        return plus.isAfter(target);
    }
}
