package com.tangbingxing.homeWork.demo3_recursion;

/**
 * 请使用递归计算从1--100的所有数的累加和。
 * @Classname Test3_2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/24 19:50
 * @Created by m1346
 */

public class Test3_2 {
    public static void main(String[] args) {
        int res = sum(100);
        System.out.println("1--100的所有数的累加和为: " + res);
    }

    /**
     * 计算1-n所有数的累加和
     * @param n
     * @return
     */
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
