package com.tangbingxing.homeWork.demo5;

/**
 * 请根据要求，完成正则表达式的编写。
 *
 * - `REGEX_PHONE`：手机号码 11 位，第一位为 1，第二位为 3-9
 * - `REGEX_EMAIL`：邮箱地址格式：`xxx@xxx.xxx`，这里xxx代表一个或多个字母数字下划线`[a-zA-Z_0-9]`
 * - `REGEX_TIME`：时间格式（选做）：`HH:mm:ss` 24小时制 00:00:00 - 23:59:59
 * @Classname Test5
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 16:57
 * @Created by m1346
 */

public class Test5 {
    public static void main(String[] args) {
        //手机号码验证
        String REGEX_PHONE = "1[3-9]\\d{9}";
        System.out.println("13458752036".matches(REGEX_PHONE));
        System.out.println("12458752036".matches(REGEX_PHONE));
        System.out.println("22458752036".matches(REGEX_PHONE));
        System.out.println("1345875036".matches(REGEX_PHONE));
        System.out.println("---------");

        //邮箱地址格式验证
        String REGEX_EMAIL = "\\w+@\\w+\\.\\w+";
        System.out.println("itcast@itheima.com".matches(REGEX_EMAIL));
        System.out.println("itcast_itheima.com".matches(REGEX_EMAIL));
        System.out.println("itcast@itheima_com".matches(REGEX_EMAIL));
        System.out.println("itcast@.itheima_com".matches(REGEX_EMAIL));
        System.out.println("---------");

        //时间格式验证
        String REGEX_TIME = "(([0-1][0-9])|(2[1-4]))(:[0-5][0-9]){2}";
        System.out.println("12:25:30".matches(REGEX_TIME));
        System.out.println("25:25:30".matches(REGEX_TIME));
        System.out.println("22:75:30".matches(REGEX_TIME));
        System.out.println("22:45:60".matches(REGEX_TIME));
    }
}
