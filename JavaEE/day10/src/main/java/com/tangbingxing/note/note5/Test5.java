package com.tangbingxing.note.note5;

import java.io.*;

/**
 * @Classname Test5
 * @Description 笔记5
 * @Version 1.0.0
 * @Date 2023/7/27 19:56
 * @Created by m1346
 */

public class Test5 {
    public static void main(String[] args) {
        try (//创建数据输出流对象，指定目标文件路径
             DataOutputStream dos = new DataOutputStream(new FileOutputStream("day10\\data.txt"));
        ){
            //写数据到文件中
            //  写字符串数据
            dos.writeUTF("ithema");
            //  写整型数据
            dos.writeInt(10);
            //  写双精度浮点型数据
            dos.writeDouble(3.14);
            //  写布尔值类型数据
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
