package com.tangbingxing.homeWork.demo7;

import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 根据已经给出的身份证号码正则表达式完成任务
 * 使用正则表达式查找出身份证号，
 * 提取出身份证中的出生日期和性别
 * 请将身份证、出生日期、性别封装到`IdInfo`对象
 * 身份证号`id`
 * 出生日期`birthday` (格式如下: `yyyy-MM-dd`)
 * 性别`sex` (1:男, 0:女)
 * 打印每个`IdInfo`对象
 *  提示
 * 出生日期：身份证号码的第7到14位
 * 性别：身份证号码的第17位，奇数为男，偶数为女
 * 待提取文本
 * String data = "来黑马程序员学习Java，\n" +
 *         "电话：18512516758，18512508907\n" +
 *         "或者联系邮箱： boniu@itcast.cn\n" +
 *         "身份证： 440306199512131548\n" +
 *         "座机电话：01036517895，010-98951256\n" +
 *         "邮箱：bozai@itcast.cn，\n" +
 *         "邮箱2：dlei0009@163.com，\n" +
 *         "身份证号：110101199001011274，\n" +
 *         "热线电话：400-618-9090 ，400-618-4000，\n" +
 *         "身份证号：21212320010213123X，\n" +
 *         "4006184000，4006189090\n";
 *身份证号正则表达式
 *public static String REGEX="\\d{6}(\\d{8})\\d{2}(\\d)([0-9]|X)";
 *
 * @Classname Test7
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 16:58
 * @Created by m1346
 */

public class Test7 {

    public static void main(String[] args) {
        String data = "来黑马程序员学习Java，\n" +
                "电话：18512516758，18512508907\n" +
                "或者联系邮箱： boniu@itcast.cn\n" +
                "身份证： 440306199512131548\n" +
                "座机电话：01036517895，010-98951256\n" +
                "邮箱：bozai@itcast.cn，\n" +
                "邮箱2：dlei0009@163.com，\n" +
                "身份证号：110101199001011274，\n" +
                "热线电话：400-618-9090 ，400-618-4000，\n" +
                "身份证号：21212320010213123X，\n" +
                "4006184000，4006189090\n";

        String REGEX="\\d{6}(\\d{8})\\d{2}(\\d)([0-9]|X)";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //将REGEX解析成Pattern对象
        Pattern compile = Pattern.compile(REGEX);
        //获取匹配器
        Matcher matcher = compile.matcher(data);

        while (matcher.find()){
            //封装信息到idInfo对象中
            IdInfo idInfo = new IdInfo();
            //身份证号码
            String id = matcher.group();
            idInfo.setId(id);
            //出生日期
            String birthday = matcher.group(1).replaceAll("(\\d{4})(\\d{2})(\\d{2})", "$1-$2-$3");
            idInfo.setBirthday(birthday);
            //性别
            int sex = Integer.valueOf(matcher.group(2)) % 2;
            idInfo.setSex(sex);
            System.out.println(idInfo);
        }
    }
}
