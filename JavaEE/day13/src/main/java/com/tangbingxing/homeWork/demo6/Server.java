package com.tangbingxing.homeWork.demo6;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

/**
 * 服务端增加集合
 * @Classname Server
 * @Description 服务端
 * @Version 1.0.0
 * @Date 2023/7/31 17:48
 * @Created by m1346
 */

public class Server {
    public static LinkedList<Socket> list = new LinkedList<>();
    public static void main(String[] args) throws Exception{
        //创建服务器套接字对象
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            //监听客户端请求
            Socket socket = ss.accept();
            //将启动的线程加入集合中
            list.add(socket);
            System.out.println(socket.getRemoteSocketAddress() + "客户端已连接");
            //开启线程处理请求
            ServerThread st = new ServerThread(socket);
            st.start();

        }
        //关闭资源
        //socket.close();
        //ss.close();
    }
}
