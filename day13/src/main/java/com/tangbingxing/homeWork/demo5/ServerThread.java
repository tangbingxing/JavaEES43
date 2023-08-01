package com.tangbingxing.homeWork.demo5;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @Classname ServerThread
 * @Description 服务端线程
 * @Version 1.0.0
 * @Date 2023/7/31 18:18
 * @Created by m1346
 */

public class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        //处理客户端请求
        while (true) {
            try {
                //获取套接字对象的输入流
                InputStream is = socket.getInputStream();
                //包装成数据流
                DataInputStream dis = new DataInputStream(is);

                //读取数据
                String msg = dis.readUTF();
                System.out.println(socket.getRemoteSocketAddress() + "客户端: " + msg);
                //is.close();
            } catch (IOException e) {
                System.out.println("客户端" + socket.getRemoteSocketAddress() + "请求已断开，服务器关闭");
                break;
            }
        }
    }
}
