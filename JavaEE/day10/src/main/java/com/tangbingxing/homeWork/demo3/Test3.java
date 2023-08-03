package com.tangbingxing.homeWork.demo3;

import java.io.*;

/**
 * 编写一个程序，实现文件的复制。
 * 使用FileInputStream读取 当前模块下resources 目录的 a.jpg 文件
 * 使用FileOutputStream将读取到的字节写入当前模块下的resources 中，保存成 b.jpg 文件
 * 请对输入流和输出流做缓冲包装，提高读写效率
 * 最后不要忘记了关闭流
 * @Classname Test3
 * @Description 作业题3
 * @Version 1.0.0
 * @Date 2023/7/27 17:01
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
        try (//创建字节输入流对象，指定源文件
             //创建字节输出流对象，指定目标文件
             //使用缓冲流包装
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10\\resources\\a.jpg"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10\\resources\\b.jpg"));
        ) {

            //定义一个字节数组存储读取到的字节数据
            byte[] bytes = new byte[8192];
            //定义一个整型变量存储读取到的字节长度
            int len;
            //循环读取
            while ((len = bis.read(bytes)) != -1) {
                //将读取到的字节数组写出
                bos.write(bytes,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
