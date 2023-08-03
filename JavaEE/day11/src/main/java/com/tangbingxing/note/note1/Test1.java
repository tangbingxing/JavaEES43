package com.tangbingxing.note.note1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 使用properties读取属性文件中的键值对信息
 * @Classname Test1
 * @Description 笔记1
 * @Version 1.0.0
 * @Date 2023/7/28 20:51
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) throws Exception {
        //   读取并打印username,password,nickname,url的值
        //创建Properties对象
        Properties properties = new Properties();
        //加载属性文件
        properties.load(new FileInputStream("day11\\src\\config.properties"));
        //   将nickname的值改为admin
        properties.setProperty("nickname","admin");
        //   新增age属性，值为18
        properties.setProperty("age","18");
        //   将变化的内容重新写会 config.properties 中
        properties.store(new FileOutputStream("day11\\src\\config.properties"),"提交测试");
    }
}
