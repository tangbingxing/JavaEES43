package com.tangbingxing.homeWork.demo7;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Classname Client
 * @Description 客户端
 * @Version 1.0.0
 * @Date 2023/7/31 19:49
 * @Created by m1346
 */

public class Client {
    public static void main(String[] args) throws Exception {
        //创建套接字对象，指定主机IP和端口号
        Socket socket = new Socket("127.0.0.1", 8888);

        // 获取套接字对象的输出流
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要查找的姓: ");
        String msg = sc.next();
        // 包装成数据流
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF(msg);

        //读取服务器端返回的信息
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String reMsg = dis.readUTF();
        System.out.println(reMsg);

        // 释放资源
        socket.close();
    }
}
