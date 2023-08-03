package com.tangbingxing.homeWork.demo1_File;

/**
 * @Classname Test1
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/14 17:31
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        provideInfo(Season.SPRING);
        provideInfo(Season.SUMMER);
        provideInfo(Season.FALL);
        provideInfo(Season.WINTER);
    }

    public static void provideInfo(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case FALL:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
        }
    }
}
