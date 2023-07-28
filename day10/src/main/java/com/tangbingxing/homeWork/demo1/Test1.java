package com.tangbingxing.homeWork.demo1;

import java.io.FileReader;
import java.io.IOException;

/**
 * 请使用FileReader读取当前模块/book.txt文件
 * @Classname Test1
 * @Description 作业题1
 * @Version 1.0.0
 * @Date 2023/7/27 16:33
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        try (//创建字符输入流对象，指定源文件路径
             FileReader fr = new FileReader("day10\\book.txt");
        ){
            //定义一个字符数组接收字符数据
            char[] chs = new char[8192];
            //定义一个整型变量接收读取到字符数据的长度
            int len;
            //循环读取字符数组
            while ((len = fr.read(chs)) != -1) {
                //输出读取到的数据
                System.out.println(new String(chs, 0, len));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
