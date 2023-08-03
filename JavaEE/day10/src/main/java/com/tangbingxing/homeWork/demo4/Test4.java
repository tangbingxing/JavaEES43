package com.tangbingxing.homeWork.demo4;

import java.io.*;

/**
 * 请编写一个程序，实现文件的复制
 * 使用FileInputStream读取 当前模块下resources 目录的 aa.txt文件
 * 使用FileOutputStream将读取到的字节写入当前模块下的resources 中，保存成 bb.txt 文件
 * 请对输入流和输出流做缓冲包装，提高读写效率
 * 最后不要忘记了关闭流
 * @Classname Test4
 * @Description 作业4
 * @Version 1.0.0
 * @Date 2023/7/27 17:16
 * @Created by m1346
 */

public class Test4 {
    public static void main(String[] args) {
        try (//定义字节输入流对象，指定源文件路径
             //定义字节输出流对象，指定目标文件路径
             //使用缓冲流包装
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10\\resources\\aa.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10\\resources\\bb.txt"));
        ){
            //定义一个变量代表读取出来的字节
            int b;
            //循环读取
            while ((b = bis.read()) != -1) {
                //每次写入一个字节
                bos.write(b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
