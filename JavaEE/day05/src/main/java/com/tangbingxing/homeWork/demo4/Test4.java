package com.tangbingxing.homeWork.demo4;

/**
 * 请实现二分查找算法，查找指定元素在数组中的位置。
 * 如果找到，返回元素在数组中的位置
 * 如果没找到，返回 `-1`
 * 数组中的元素是升序的（不用自行排序）
 *
 * @Classname Test4
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 16:57
 * @Created by m1346
 */

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {10,20,38,50,66};
        System.out.println(bubbleSortReverse(arr, 38));
        System.out.println(bubbleSortReverse(arr, 100));
    }

    public static int bubbleSortReverse(int[] arr,int target) {
        int index = -1;
        //开始索引
        int start = 0;
        //结束索引
        int end = arr.length - 1;
        //中间索引
        int middle = (start + end)/2;
        //判断
        while (start <= end) {
            //在右边，将开始索引移到中间索引加一的位置
            if (arr[middle] < target) {
                start = middle+1;
            }
            //在左边，将结束索引移到中间索引减一的位置
            else if (arr[middle] > target) {
                end = middle - 1;
            }
            //找到了
            else if (arr[middle] == target){
                return middle;
            }
            middle = (start + end)/2;
        }
        return index;
    }
}
