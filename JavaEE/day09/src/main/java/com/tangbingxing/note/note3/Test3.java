package com.tangbingxing.note.note3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用字节流一次读写一个字节数组拷贝文件
 * @Classname Test3
 * @Description 笔记3
 * @Version 1.0.0
 * @Date 2023/7/25 16:29
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
        try (
                //1.创建一个字节输入流对象读取文件，指定源文件路径
                FileInputStream fis = new FileInputStream("day09\\input\\b.txt");
                //2.创建一个字节输出流对象写出文件，指定目标文件路径
                FileOutputStream fos = new FileOutputStream("day09\\output\\bCopy.txt");
        ) {
            //3.创建一个字节数组接收读出来的字节
            byte[] b = new byte[1000];
            //4.定义每次读取的字节数
            int length;
            //5.使用while循环，每次读一个字节数组
            while ((length = fis.read(b)) != -1) {
                //6.将读取出来的字节数组写出到指定文件
                fos.write(b,0,length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
