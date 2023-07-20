package com.tangbingxing.homeWork.demo3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @Classname Test3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/17 16:58
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个日期，格式为yyyy-MM-dd");
        String time = scanner.next();
        System.out.println("星期" + returnWeek(time));
    }

    private static int returnWeek(String s) {
        //解析时间
        LocalDate date = null;
        int dayOfWeek;
        try {
            //获取格式化器对象
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            date = LocalDate.parse(s,dtf);
            dayOfWeek = date.getDayOfWeek().getValue();
        } catch (Exception e) {
            System.out.println("输入日期格式有误");
            dayOfWeek = 0;
        }
        return dayOfWeek;
    }
}
