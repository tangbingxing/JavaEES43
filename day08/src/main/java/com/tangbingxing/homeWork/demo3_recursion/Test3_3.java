package com.tangbingxing.homeWork.demo3_recursion;

import java.io.File;

/**
 * 请使用递归遍历一个多级目录，打印所有文件的“绝对路径”
 * @Classname Test3_3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/24 19:54
 * @Created by m1346
 */

public class Test3_3 {
    public static void main(String[] args) {
        printFile(new File("C:"));
    }

    /**
     * 遍历一个多级目录，并打印所有文件的绝对路径
     * @param fileOrDir
     */
    public static void printFile(File fileOrDir) {
        //非空判断
        if (fileOrDir != null) {
            // 判断file为目录
            if (fileOrDir.isDirectory()) {
                // 继续遍历子目录和文件
                for (File f : fileOrDir.listFiles()) {
                    printFile(f);
                }
            }
            // 判断file为文件，打印绝对路径
            else if (fileOrDir.isFile()) {
                System.out.println(fileOrDir.getAbsolutePath());
            }
        }
    }
}
