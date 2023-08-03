package com.tangbingxing.homeWork.demo1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Classname Receive
 * @Description 接收端
 * @Version 1.0.0
 * @Date 2023/7/31 17:16
 * @Created by m1346
 */

public class Receive {
    public static void main(String[] args) throws Exception{
        //创建数据套接字对象， 指定端口号为6666
        DatagramSocket ds = new DatagramSocket(6666);
        //准备接收数据报，并用数据包进行封装
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //接收数据，将数据封装到数据包中
        ds.receive(dp);
        //获取真实接收的字节个数
        int length = dp.getLength();
        // 读取数据包中的内容
        System.out.println(new String(bytes, 0, length));

        //释放资源
        ds.close();



    }
}
