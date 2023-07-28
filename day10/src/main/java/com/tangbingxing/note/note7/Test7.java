package com.tangbingxing.note.note7;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * @Classname Test7
 * @Description 笔记7
 * @Version 1.0.0
 * @Date 2023/7/27 20:05
 * @Created by m1346
 */

public class Test7 {
    public static void main(String[] args) throws IOException {
        //先导入第三方框架
        //使用工具类FileUtils
        //拷贝一个文件
        FileUtils.copyFile(new File("day10\\resources\\aa.txt"),new File("day10\\resources\\cc.txt"));
        //拷贝一个文件夹
        FileUtils.copyDirectory(new File("day10\\resources"),new File("day10\\copyDirectory"));
        //删除一个文件夹
        FileUtils.deleteDirectory(new File("day10\\copyDirectory"));

        //使用工具类IOUtils
        //拷贝一个文件
        IOUtils.copy(new FileInputStream("day10\\resources\\a.jpg"),new FileOutputStream("day10\\resources\\aCopy.jpg"));
        //写数据
        IOUtils.write("abc",new FileOutputStream("day10\\resources\\write.txt"),"utf-8");
    }
}
