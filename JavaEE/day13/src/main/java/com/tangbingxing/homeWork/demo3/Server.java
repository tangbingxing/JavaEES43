package com.tangbingxing.homeWork.demo3;

import java.io.DataInputStream;
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
        //获取套接字对象的输入流
        InputStream is = socket.getInputStream();
        //包装成数据流
        DataInputStream dis = new DataInputStream(is);
        //读取数据
        String msg = dis.readUTF();
        System.out.println(msg);
        //关闭资源
        socket.close();
        ss.close();
    }
}
