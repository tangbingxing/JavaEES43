package com.tangbingxing.homeWork.demo2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Classname Test2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/17 16:31
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        String v1 = "128.9";
        Double v2 = 1058.5;
        divide(v1,v2);
    }

    private static void divide(String v1,Double v2) {
        BigDecimal bd1 = new BigDecimal(v1);
        BigDecimal bd2 = BigDecimal.valueOf(v2);
        System.out.println(bd2.divide(bd1, 3, RoundingMode.HALF_UP));
    }
}
