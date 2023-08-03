package com.tangbingxing.homeWork.demo3_recursion;

/**
 * 请使用递归计算5的阶乘
 * @Classname Test3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/24 16:58
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println("5的阶乘计算结果为: " + res);
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
