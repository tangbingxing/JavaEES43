package com.tangbingxing.homeWork.demo6;

import java.io.*;

/**
 * 请先往 当前模块下的data.txt 按照如下顺序及类型写入数据，并且再次按照以下顺序，读取出来其中的数据，然后输出到控制台。
 * @Classname Test6
 * @Description 作业题6
 * @Version 1.0.0
 * @Date 2023/7/27 17:32
 * @Created by m1346
 */

public class Test6 {
    public static void main(String[] args) {
        try (//创建数据输出流对象，指定目标文件路径
             DataOutputStream dos = new DataOutputStream(new FileOutputStream("day10\\data.txt"));
        ){
            //写数据到文件中
            //  UTF
            dos.writeUTF("ithema");
            //  Int
            dos.writeInt(10);
            //  Double
            dos.writeDouble(3.14);
            //  Boolean
            dos.writeBoolean(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (//创建数据输入流对象，指定源文件路径
             DataInputStream dis = new DataInputStream(new FileInputStream("day10\\data.txt"));
        ) {
            //读取数据到控制台
            String s = dis.readUTF();
            System.out.println(s);
            int i = dis.readInt();
            System.out.println(i);
            double v = dis.readDouble();
            System.out.println(v);
            boolean b = dis.readBoolean();
            System.out.println(b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
