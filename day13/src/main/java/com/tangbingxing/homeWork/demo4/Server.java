package com.tangbingxing.homeWork.demo4;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname Server
 * @Description 服务端
 * @Version 1.0.0
 * @Date 2023/7/31 17:48
 * @Created by m1346
 */

public class Server {
    public static void main(String[] args) throws Exception{
        //创建服务器套接字对象
        ServerSocket ss = new ServerSocket(8888);
        //监听客户端请求
        Socket socket = ss.accept();
        while (true) {
            //获取套接字对象的输入流
            InputStream is = socket.getInputStream();
            //包装成数据流
            DataInputStream dis = new DataInputStream(is);
            try {
                //读取数据
                String msg = dis.readUTF();
                System.out.println(msg);
            } catch (IOException e) {
                System.out.println("客户端请求已断开，服务器关闭");
                break;
            }
        }
        //关闭资源
        //socket.close();
        //ss.close();
    }
}
