package com.tangbingxing.homeWork.demo8;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Classname Client
 * @Description 客户端
 * @Version 1.0.0
 * @Date 2023/7/31 20:09
 * @Created by m1346
 */

public class Client {
    public static void main(String[] args) throws Exception {
        //获取套接字
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1", 8888);
        while (true) {
            //获取输出流
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            //获取输入流
            InputStream is = socket.getInputStream();
            DataInputStream dis  = new DataInputStream(is);

            System.out.println("请输入00获取所有的文件列表，输入对应的电影名下载电影，输入exit退出程序");
            //用户输入的选择
            String choice = sc.next();
            dos.writeUTF(choice);
            switch (choice) {
                case "00":
                    String res = dis.readUTF();
                    System.out.println(res);
                    break;
                case "exit":
                    dos.close();
                    dis.close();
                    socket.close();
                    return;
                default:
                    //创建字节输入流，写入电影文件
                    FileOutputStream fos = new FileOutputStream("day13\\Client\\" + choice);
                    byte[] bytes = new byte[8192];
                    int length;
                    while ((length = is.read(bytes)) != -1) {
                        fos.write(bytes, 0, length);
                    }

                    System.out.println("下载完成");
            }
        }
    }
}
