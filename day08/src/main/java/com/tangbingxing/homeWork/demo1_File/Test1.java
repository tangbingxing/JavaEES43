package com.tangbingxing.homeWork.demo1_File;

import java.io.File;


/**
 * 请在D盘根目录下创建一个文件：test1.txt(随意录入一些内容)，再创建一个目录：测试目录
 * 	请编写main()方法，创建以下两个File对象：
 * 		File file1 = new File(“d:\\test1.txt”;
 * 		File file2 = new File(“d:\\测试目录”);
 * 	要求：
 * 		1. 获取、打印file1和file2的绝对路径；
 * 		2. 获取、打印file1和file2的文件名和目录名；
 * 		3. 获取、打印file1和file2的文件大小；
 * 		4. 分别判断file1和file2是否存在；
 * @Classname Test1
 * @Description 作业题1_1
 * @Version 1.0.0
 * @Date 2023/7/24 19:31
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        //创建File对象
        //File file1 = new File("D:\\test1.txt");
        //File file2 = new File("D:\\测试目录");
        File file1 = new File("day08\\test1.txt");
        File file2 = new File("day08\\测试目录");



        //1. 获取、打印file1和file2的绝对路径；
        System.out.println("file1的绝对路径 " + file1.getAbsoluteFile());
        System.out.println("file2的绝对路径 " + file2.getAbsoluteFile());
        System.out.println("================");
        //2. 获取、打印file1和file2的文件名和目录名
        System.out.println("file1的文件名 " + file1.getName());
        System.out.println("file2的目录名 " + file2.getName());
        System.out.println("================");

        //3. 获取、打印file1和file2的文件大小；
        System.out.println("file1的文件大小为 " + file1.length());
        System.out.println("file2的文件夹大小为 " + getSize(file2));
        System.out.println("================");

        //4. 分别判断file1和file2是否存在；
        System.out.println("file1文件是否存在 " + file1.exists());
        System.out.println("file2文件夹是否存在 " + file2.exists());
        System.out.println("================");


        //5.分别判断file1和file2是否是文件？是否是目录？
        System.out.println("file1是否为文件 " + file1.isFile());
        System.out.println("file1是否为文件 " + file2.isFile());
        System.out.println("================");

        System.out.println("file1是否为目录 " + file1.isDirectory());
        System.out.println("file1是否为目录 " + file2.isDirectory());
    }

    /**
     * 获取文件的字节大小
     * @param file
     * @return
     */
    public static long getSize(File file) {
        // 获取当前文件夹下的所有子文件和子文件夹
        File[] files = file.listFiles();

        // 定义一个变量,用来记录当前文件夹的字节大小
        long size = 0;

        if (files != null) {
            // 循环遍历所有的子文件和子文件夹
            for (File file1 : files) {
                // 如果是文件,就获取该文件的字节大小,进行累加
                if (file1.isFile()){
                    long length = file1.length();
                    size += length;
                }
                // 如果是文件夹,就递归计算该文件夹的字节大小,并返回
                if (file1.isDirectory()){
                    size += getSize(file1);
                }
            }
        }
        return size;
    }
}
