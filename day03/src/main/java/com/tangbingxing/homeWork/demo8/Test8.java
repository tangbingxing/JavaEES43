package com.tangbingxing.homeWork.demo8;

import java.util.Scanner;

/**
 * @Classname Test8
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/14 19:41
 * @Created by m1346
 */

public class Test8 {
    public static void main(String[] args) throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 0 || age > 200) {
            throw new InvalidInputException("无效输入");
        }
    }
}
