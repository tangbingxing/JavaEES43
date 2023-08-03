package com.tangbingxing.note.note2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用字符流一次读写一个字符数组拷贝文本文件
 * @Classname Test2
 * @Description 笔记2
 * @Version 1.0.0
 * @Date 2023/7/27 19:26
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        try (//创建字符输入流，指向源文件地址
             FileReader fr = new FileReader("day10\\resources\\aa.txt");

             //创建字符输出流，指向目标文件地址
             FileWriter fw = new FileWriter("day10\\resources\\bb.txt");

        ) {
            //创建一个字符数组接收的字节数据
            char[] chs = new char[8192];

            //创建一个变量接收读取到的字节数组长度
            int len;

            //循环读取
            while ((len = fr.read(chs)) != -1) {
                //写入一个字符数组到目标文件
                fw.write(chs,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
