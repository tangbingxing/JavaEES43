package com.tangbingxing.note.note4;

import java.io.*;

/**
 * 使用转换流把gbk编码的文件转换为utf8编码的文件
 * @Classname Test4
 * @Description 笔记4
 * @Version 1.0.0
 * @Date 2023/7/27 19:46
 * @Created by m1346
 */

public class Test4 {
    public static void main(String[] args) {
        try (//创建字符输入转换流，指定源文件路径和解码格式
             InputStreamReader isr = new InputStreamReader(new FileInputStream("day10\\resources\\gbk.txt"),"gbk");
             //创建字符输出抓换流，指定目标文件路径和编码格式
             OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10\\resources\\gbk_utf8.txt"),"utf-8");
        ) {
            //定义一个变量接收读取到的数组
            int b;
            while ((b = isr.read()) != -1) {
                //写出一个字节到文件中
                osw.write(b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
