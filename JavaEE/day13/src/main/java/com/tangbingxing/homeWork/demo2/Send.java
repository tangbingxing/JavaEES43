package com.tangbingxing.homeWork.demo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Classname Send
 * @Description 发送端
 * @Version 1.0.0
 * @Date 2023/7/31 17:15
 * @Created by m1346
 */

public class Send {
    public static void main(String[] args) throws Exception{
        //创建数据套接字对象
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            Scanner sc = new Scanner(System.in);
            String msg = sc.next();
            //准备发送数据报，并用数据包进行封装
            byte[] bytes = msg.getBytes();
            InetAddress localHost = InetAddress.getLocalHost();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, localHost, 6666);
            //发送数据包
            ds.send(dp);
            if ("exit".equals(msg)) {
                System.out.println("发送端关闭了");
                //释放资源
                ds.close();
                //退出循环
                break;
            }
        }
    }
}
