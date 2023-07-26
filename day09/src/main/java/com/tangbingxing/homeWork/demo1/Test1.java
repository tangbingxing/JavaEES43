package com.tangbingxing.homeWork.demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 请使用字节流复制一个文件，一次读、写一个字节。
 * @Classname Test1
 * @Description 作业题1_1
 * @Version 1.0.0
 * @Date 2023/7/25 15:41
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        //要求:使用字节流复制一个文件，一次读、写一个字节
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
