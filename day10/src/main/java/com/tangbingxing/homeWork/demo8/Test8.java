package com.tangbingxing.homeWork.demo8;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 请使用IO工具类拷贝一个文件,文件夹,以及删除一个文件夹
 * @Classname Test8
 * @Description 作业8
 * @Version 1.0.0
 * @Date 2023/7/27 18:02
 * @Created by m1346
 */

public class Test8 {
    public static void main(String[] args) throws IOException {
        //先导入第三方框架
        //使用工具类FileUtils
        //拷贝一个文件
        FileUtils.copyFile(new File("day10\\resources\\aa.txt"),new File("day10\\resources\\cc.txt"));
        //拷贝一个文件夹
        FileUtils.copyDirectory(new File("day10\\resources"),new File("day10\\copyDirectory"));
        //删除一个文件夹
        FileUtils.deleteDirectory(new File("day10\\copyDirectory"));
    }
}
