package com.tangbingxing.test;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname Service
 * @Description 服务端
 * @Version 1.0.0
 * @Date 2023/7/31 11:23
 * @Created by m1346
 */

public class Service {
    public static void main(String[] args) throws Exception{
        //创建服务ServerSocket，指定服务器的端口号
        ServerSocket ss = new ServerSocket(7777);
        while (true) {
            //创建阻塞
            Socket accept = ss.accept();
            System.out.println(accept);//返回的是客户端的套接字对象,可用来接收数据

            ServiceThread st = new ServiceThread(accept);
        }
        //ss.close();
    }
}
