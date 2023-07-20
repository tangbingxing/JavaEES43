package com.tangbingxing.homeWork.demo8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * @Classname Test8
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 10:40
 * @Created by m1346
 */

public class Test8 {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    public static String showInfo(String start, String end) {
        LocalDate startDate = null;
        LocalDate endDate = null;
        try {
            startDate = LocalDate.parse(start, formatter);
            endDate = LocalDate.parse(end, formatter);
        } catch (DateTimeParseException e) {
            // 日期格式错误
            return null;
        }

        Period p = Period.between(startDate, endDate);
        if(p.isNegative()) {
            // 开始日期大于结束日期
            return null;
        }

        StringBuilder sb = new StringBuilder("共持续了");
        if (p.getYears() > 0) sb.append(p.getYears()).append("年");
        if (p.getMonths() > 0) sb.append(p.getMonths()).append("月");
        if (p.getDays() > 0) sb.append(p.getDays()).append("天");
        System.out.println(sb.toString());
        return sb.toString();
    }
}
