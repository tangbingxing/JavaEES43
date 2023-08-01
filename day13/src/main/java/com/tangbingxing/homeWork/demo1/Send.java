package com.tangbingxing.homeWork.demo1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

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
        //准备发送数据报，并用数据包进行封装
        String msg = "测试数据";
        byte[] bytes = msg.getBytes();
        InetAddress localHost = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, localHost, 6666);
        //发送数据包
        ds.send(dp);
        //释放资源
        ds.close();
    }
}
