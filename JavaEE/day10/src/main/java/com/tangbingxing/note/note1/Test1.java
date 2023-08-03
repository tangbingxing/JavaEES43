package com.tangbingxing.note.note1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用字符流一次读写一个字符拷贝文本文件
 * @Classname Test1
 * @Description 笔记1
 * @Version 1.0.0
 * @Date 2023/7/27 18:15
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        try (//创建一个字符输入流，指定源文件路径
             FileReader fr = new FileReader("day10\\resources\\aa.txt");
             //创建一个字符输出流，指定目标文件路径
             FileWriter fw = new FileWriter("day10\\resources\\bb.txt");
        ){
            //定义一个变量接收读取到的字符
            int c;
            //循环读取
            while ((c = fr.read()) != -1) {
                //每读一个字节就写一个字节出去
                fw.write(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
