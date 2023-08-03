package com.tangbingxing.exam3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 编写程序，该程序启动后用户可以按“yyyy-MM-dd”的格式输入一个日期，程序计算这一天是星期几，并且计算出是一年中的第几天
 * 打印格式：
 *      请输入数字日期字符串(格式:2015-10，-20):
 *      2017-07-22
 *      2017年-07月-22日是 星期六，是  2017年的第 203 天
 * @Classname Test3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/22 11:13
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字日期字符串(格式:2015-10-20)");
        String date = scanner.next();

        //创建格式化器
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //将输入的字符串日期转换成日期对象
        LocalDate date1 = LocalDate.parse(date, dtf);

        //创建格式化器，按照XXXX年-XX月-XX日输出
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy年-MM月-dd日");
        String date2 = dtf1.format(date1);

        //获取该日期对象是一周的第几天
        DayOfWeek dayOfWeek = date1.getDayOfWeek();

        //获取该日期对象是一年中的第几天
        int dayOfYear = date1.getDayOfYear();
        int year = date1.getYear();

        System.out.println(date2 + "是 星期" + dayOfWeek.getValue() + "，是 " + year + " 年第 " + dayOfYear + " 天");
    }
}
