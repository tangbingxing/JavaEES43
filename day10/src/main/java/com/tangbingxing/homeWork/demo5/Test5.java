package com.tangbingxing.homeWork.demo5;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @Classname Test5
 * @Description 作业题5
 * @Version 1.0.0
 * @Date 2023/7/27 17:29
 * @Created by m1346
 */

public class Test5 {
    public static void main(String[] args) {
        try (// 创建PrintStream对象，文件路径为 当前模块下/output2.txt
             PrintStream ps = new PrintStream("day10\\output2.txt");
        ){
            // 将System.out的输出重定向到文件output2.txt中
            System.setOut(ps);
            // 通过System.out输出 , 把  Hello World! 输出到文件中
            System.out.println("Hello World!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
