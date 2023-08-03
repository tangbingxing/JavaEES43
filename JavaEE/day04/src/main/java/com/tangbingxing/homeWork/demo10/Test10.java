package com.tangbingxing.homeWork.demo10;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

/**
 * @Classname Test10
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 10:43
 * @Created by m1346
 */

public class Test10 {
    public static void main(String[] args) {
        double[] prices = {4.2, 1.3, 21.12, 5.3, 8.0, 2.2, 1.0, 0.5, 0.3, 12.2, 6.65};

        run(prices);
    }

    public static String run(double[] prices) {
        double[] newArray = Arrays.copyOfRange(prices, 2, 5);

        Arrays.setAll(newArray, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int i) {
                return newArray[i] > 1.0 ? newArray[i] * 0.8 : newArray[i];
            }
        });

        Arrays.sort(newArray);

        final String rst = Arrays.toString(newArray);
        System.out.println(rst);
        return rst;
    }
}
