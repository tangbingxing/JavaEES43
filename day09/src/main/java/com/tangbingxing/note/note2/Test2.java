package com.tangbingxing.note.note2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用字节流一次读写一个字节拷贝文件
 * @Classname Test2
 * @Description 笔记2
 * @Version 1.0.0
 * @Date 2023/7/25 16:28
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        try (
                //1.创建一个字节输入流对象读取文件，指定源文件路径
                FileInputStream fis = new FileInputStream("day09\\input\\a.txt");
                //2.创建一个字节输出流对象写出文件，指定目标文件路径
                FileOutputStream fos = new FileOutputStream("day09\\output\\aCopy.txt");
        ) {
            //3.创建一个字节变量接收读出来的字节
            int b;
            //4.使用while循环，每次读取一个字节
            while ((b = fis.read()) != -1) {
                //5.将读取出来的字节写出到指定文件
                fos.write(b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
