package com.tangbingxing.homeWork.demo1_File;

import java.io.File;

/**
 * 请在D盘下创建一个目录“多级目录”，下面随意创建一些文件和目录。
 * 	请编写main()方法，创建以下File对象：
 * 		File file = new File(“D:\\多级目录”);
 * 	要求：
 * 		1. 获取这个file目录下所有的子文件/子目录的File数组
 * 		2. 遍历这个数组，判断每个File对象是否文件
 * 			如果是文件，打印：【文件】+ 绝对路径
 * 			如果是目录，打印：【目录】+ 绝对路径
 * @Classname Test1_3
 * @Description 作业题1_3
 * @Version 1.0.0
 * @Date 2023/7/24 20:53
 * @Created by m1346
 */

public class Test1_3 {
    public static void main(String[] args) {
        File file = new File("D:\\多级目录");

        //获取这个file目录下所有的子文件/子目录的File数组
        File[] files = file.listFiles();
        //判断File数组是否为null
        if (files != null) {
            //不为null，遍历这个数组
            for (File file1 : files) {
                if (file1.isFile()) {
                    //如果是文件
                    System.out.println("【文件】" + file1.getAbsolutePath());
                } else if (file1.isDirectory()) {
                    //如果是目录
                    System.out.println("【目录】" + file1.getAbsolutePath());
                }
            }
        }
    }
}
