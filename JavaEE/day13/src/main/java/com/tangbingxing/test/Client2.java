package com.tangbingxing.test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Classname Client
 * @Description 客户端
 * @Version 1.0.0
 * @Date 2023/7/31 11:22
 * @Created by m1346
 */

public class Client2 {
    public static void main(String[] args) throws Exception{
        //Socket socket = null;
        while (true) {
            //创建套接字对象
            Socket socket = new Socket("127.0.0.1",7777);
            System.out.println(socket);//返回的是服务端的套接字对象,可用来发送数据
            while (true) {
                Scanner sc = new Scanner(System.in);
                //创建数据
                System.out.println("请输入消息:");
                String msg = sc.next();
                if (msg.equals("exit")) {
                    System.out.println("断开连接");
                    break;
                }
                try {
                    //发送数据
                    OutputStream os = socket.getOutputStream();
                    DataOutputStream dos = new DataOutputStream(os);
                    //os.write(msg.getBytes());
                    dos.writeUTF(msg);
                } catch (IOException e) {
                    System.out.println("写入异常");
                }
            }
        }
        //释放资源
        //socket.close();
    }
}
