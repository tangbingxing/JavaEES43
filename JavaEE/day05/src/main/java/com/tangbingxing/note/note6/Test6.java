package com.tangbingxing.note.note6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 爬取一段文本中的电话和邮箱,以及邮箱用户名
 * @Classname Test6
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/24 21:06
 * @Created by m1346
 */

public class Test6 {
    public static void main(String[] args) {
        String text = "来黑马程序员学习Java，\n" +
                "电话：18512516758，18512508907\n" +
                "或者联系邮箱： boniu@itcast.cn\n" +
                "座机电话：01036517895，010-98951256\n" +
                "邮箱：bozai@itcast.cn，\n" +
                "邮箱2：dlei0009@163.com，\n" +
                "热线电话：400-618-9090 ，400-618-4000，\n" +
                "4006184000，4006189090";
        String phone = "010_?\\d{8}";
        String email = "[a-zA-Z]{3,5}@[a-zA-Z]{3,10}\\.[a-zA-Z]{2,5}";
        String mobile = "1[3-9]\\d{9}";
        String hotline = "400-?618-?\\d{3}";
        String regex = phone + "|" + email + "|" + mobile + "|" + hotline;
        System.out.println(regex);

        //创建Pattern对象
        Pattern compile = Pattern.compile(regex);

        //获取匹配器
        Matcher matcher = compile.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
