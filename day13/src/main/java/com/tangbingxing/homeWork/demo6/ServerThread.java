package com.tangbingxing.homeWork.demo6;

import java.io.*;
import java.net.Socket;

/**
 * 将客户端传来的数据群发给其他客户端
 * 如果客户端退出，则从集合中删除
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

                //将读取到的数据群发给其他客户端
                //遍历集合
                for (Socket socket1 : Server.list) {
                    //如果不是当前线程，则转发数据给其他客户端
                    if (socket1 != socket) {
                        //给其他客户端转发数据
                        OutputStream os = socket1.getOutputStream();
                        DataOutputStream dos = new DataOutputStream(os);
                        dos.writeUTF(socket.getRemoteSocketAddress() + "服务器转发 " + msg);
                        //new DataOutputStream(socket1.getOutputStream()).writeUTF(msg);
                    }
                }
                //is.close();
            } catch (IOException e) {
                System.out.println("客户端" + socket.getRemoteSocketAddress() + "请求已断开");
                Server.list.remove(socket);
                //socket.close();
                break;
            }
        }
    }
}
