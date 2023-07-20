package com.tangbingxing.homeWork.demo2;

import java.util.Arrays;

/**
 * 请使用冒泡排序算法对数组进行降序排序（从大到小排列）。
 *
 * 请在`bubbleSortReverse`方法中实现冒泡排序算法。
 * @Classname Test2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 16:56
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {2,8,5,12,6};
        System.out.println(Arrays.toString(bubbleSortRevere(arr)));

    }

    public static int[] bubbleSortRevere(int[] arr) {
        //外循环次数  数组长度-1次
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环次数  数组长度-1-i次
            for (int j = 0; j < arr.length - i - 1; j++) {
                //每次从0号索引位置开始，比较相邻的元素，大的放前面，小的放后面
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
