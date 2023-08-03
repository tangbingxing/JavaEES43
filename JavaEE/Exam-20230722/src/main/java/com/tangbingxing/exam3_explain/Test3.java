package com.tangbingxing.exam3_explain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Classname Test3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/22 16:55
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字日期字符串(格式:2015-10-20)");
        String sDate = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(sDate);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年-MM月-dd日");
        String date1 = sdf1.format(date);

        Calendar cDate = Calendar.getInstance();

        cDate.setTime(date);

        int week = cDate.get(Calendar.DAY_OF_WEEK);
        String[] weeks = {"","日","一","二","三","四","五","六"};

        int year = cDate.get(Calendar.YEAR);

        int day = cDate.get(Calendar.DAY_OF_YEAR);

        System.out.println(date1 + "是 星期" + weeks[week] + "，是  "+year+"年的第 "+ day +" 天");

    }
}
