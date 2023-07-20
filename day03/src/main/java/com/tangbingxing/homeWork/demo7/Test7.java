package com.tangbingxing.homeWork.demo7;

import java.util.StringJoiner;

/**
 * @Classname Test7
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/14 18:10
 * @Created by m1346
 */

public class Test7 {
    public static void main(String[] args) {
        double[] array = {1.237,3.145,2.168,8.755};
        System.out.println(arrayToString(array));

    }

    private static String arrayToString(double[] array) {
        StringJoiner text = new StringJoiner(",", "[", "]");
        //String text="";
        for (int i = 0; i < array.length; i++) {
            text.add(String.format("%.2f", array[i]));
        }
        return text.toString();
    }
}
