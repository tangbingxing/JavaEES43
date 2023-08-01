package com.tangbingxing.homeWork.demo6;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Classname Client
 * @Description 客户端
 * @Version 1.0.0
 * @Date 2023/7/31 17:48
 * @Created by m1346
 */

public class Client {
    public static void main(String[] args) throws Exception{
        //创建客户端套接字对象
        Socket socket = new Socket("127.0.0.1", 8888);
        //开启线程,一直读取服务端回写的数据
        ClientRunnalbe cr = new ClientRunnalbe(socket);
        Thread thread = new Thread(cr);
        thread.start();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要发送的信息");
            String msg = sc.next();
            if ("exit".equals(msg)) {
                System.out.println("客户端请求已断开");
                //释放资源
                socket.close();
                break;
            } else {
                //获取套接字对象的输出流
                OutputStream os = socket.getOutputStream();
                //包装成数据流
                DataOutputStream dos = new DataOutputStream(os);
                //写入数据
                dos.writeUTF(msg);
            }
        }
        socket.close();
    }
}
