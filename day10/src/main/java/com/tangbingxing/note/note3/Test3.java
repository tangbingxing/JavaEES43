package com.tangbingxing.note.note3;

import java.io.*;
import java.util.TreeSet;

/**
 * 使用缓冲流恢复文本顺序
 * @Classname Test3
 * @Description 笔记3
 * @Version 1.0.0
 * @Date 2023/7/27 19:34
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
        //创建TreeSet集合
        TreeSet<String> strings = new TreeSet<>();
        try (//创建缓冲输入流,指定源文件
             BufferedReader br = new BufferedReader(new FileReader("day10\\resources\\t.txt"));
        ) {
            //定义变量，接收读取到的内容
            String line;
            //循环读取内容
            while ((line = br.readLine() ) != null) {
                //将按行读取出来的内容存入到TreeSet集合,实现自动排序功能
                strings.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (//创建缓冲输出流，指定目标文件
             BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\resources\\t.txt"));
        ) {
            //将排序后的内容从集合中读取到文件中
            for (String string : strings) {
                bw.write(string);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
