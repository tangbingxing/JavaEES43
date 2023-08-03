package com.tangbingxing.homeWork.demo5;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * @Classname Test5
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/17 17:30
 * @Created by m1346
 */

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //生日时间
        LocalDateTime birthDay = LocalDateTime.of(1949, 10, 1,0,0);
        System.out.println("请输入天数");
        int days = scanner.nextInt();
        System.out.println("请输入小时数");
        int hours = scanner.nextInt();
        System.out.println(isBirthdayFromNow(days,hours,birthDay));
    }

    public static int isBirthdayFromNow(int days, int hours, LocalDateTime birthDay) {
        // 获取穿越后的日期时间
        LocalDateTime calculatedDay = LocalDateTime.now().plusDays(days).plusHours(hours);

        // 获取穿越后当年的生日日期时间
        LocalDateTime birthDayThisYear = birthDay.withYear(calculatedDay.getYear());

        // 获取当前的月和日
        int month = calculatedDay.getMonthValue();
        int day = calculatedDay.getDayOfMonth();

        // 获取生日的月和日
        int birthdayMonth = birthDayThisYear.getMonthValue();
        int birthdayDay = birthDayThisYear.getDayOfMonth();

        // 判断
        if (month < birthdayMonth ){
            // 月份没到
            return -1;
        }else if (month > birthdayMonth){
            // 月份已过
            return 1;
        }else{
            // 月份刚好,判断日
            if (day < birthdayDay){
                return -1;
            }else if (day > birthdayDay){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
