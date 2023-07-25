package com.tangbingxing.homeWork.demo1_File;

import java.io.File;
import java.io.IOException;

/**
 * 请编写main()方法，创建以下File对象：
 * 		File file1 = new File(“test.txt”);//相对路径，在项目根目录下
 * 		File file2 = new File(“一级目录”);
 * 		File file3 = new File(“目录A/目录B/目录C”);
 * 	要求：
 * 		1. 判断file1是否存在？如果不存在，创建这个文件。
 * 		2. 判断file2是否存在？如果不存在，创建这个目录。
 * 		3. 判断file3是否存在？如果不存在，创建这个多级目录。
 * @Classname Test1_2
 * @Description 作业题1_2
 * @Version 1.0.0
 * @Date 2023/7/24 20:46
 * @Created by m1346
 */

public class Test1_2 {
    public static void main(String[] args) throws IOException {
        //创建File对象
        File file1 = new File("test.txt");
        File file2 = new File("一级目录");
        File file3 = new File("目录A/目录B/目录C");

        if (!file1.exists()) {
            //如果文件不存在，则创建文件
            //File.createNewFile(file1)
            file1.createNewFile();
        }
        if (!file2.exists()) {
            //如果文件夹不存在，则创建文件夹
            file2.mkdir();
        }
        if (!file3.exists()) {
            //如果多级文件夹不存在，则创建多级文件夹
            file3.mkdirs();
        }
    }
}
