package com.tangbingxing.homeWork.demo2;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 请使用FileWriter类输出内容,输出到 当前模块/output.txt中
 * @Classname Test2
 * @Description 作业题2
 * @Version 1.0.0
 * @Date 2023/7/27 16:54
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) {
        try (
             //定义一个字符流对象，指定目标文件路径
             FileWriter fw = new FileWriter("day10\\output.txt");
        ) {
            //1、写一个字符出去 writeChar(fw);
            fw.write('a');
            //2、写一个字符串出去 writeString(fw);
            fw.write("bcdef");
            //3、写一个字符数组出去 writeBuffer(fw);
            char[] chs = {'g','h','i'};
            fw.write(chs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
