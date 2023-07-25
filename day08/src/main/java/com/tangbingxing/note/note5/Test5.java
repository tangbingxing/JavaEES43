package com.tangbingxing.note.note5;

/**
 * @Classname Test5
 * @Description 使用递归计算n的阶乘
 * @Version 1.0.0
 * @Date 2023/7/24 17:11
 * @Created by m1346
 */

public class Test5 {
    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println(res);

    }

    /**
     * 使用递归计算n的阶乘
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
