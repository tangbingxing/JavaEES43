package com.tangbingxing.homeWork.demo3;

import java.util.Arrays;

/**
 * 请使用选择排序算法对数组进行降序排序（从大到小排列）。
 *
 * 请在`bubbleSortReverse`方法中实现选择排序算法。
 * @Classname Test3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 16:57
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {2,8,5,12,6};
        System.out.println(Arrays.toString(bubbleSortReverse(arr)));

    }
    public static int[] bubbleSortReverse(int[] arr) {
        //外循环次数  数组长度-1
        for (int i = 0; i < arr.length - 1; i++) {

            //内循环次数  数组长度-1-i
            for (int j = i ; j < arr.length - 1; j++) {
                //从0号索引开始，与后面的每个元素比较,大的放前面，小的放后面
                if (arr[i] < arr[j + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
