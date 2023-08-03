package com.tangbingxing.homeWork.demo2;

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
        while (true) {
            //准备接收数据报，并用数据包进行封装
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            //接收数据，将数据封装到数据包中
            ds.receive(dp);
            //  获取真实接收的字节个数
            int length = dp.getLength();

            // 读取数据包中的内容
            String msg = new String(bytes, 0, length);
            System.out.println(msg);
            if ("exit".equals(msg)){
                System.out.println("发送端关闭了,服务端关闭");
                //释放资源
                ds.close();
                //退出循环
                break;
            }
        }
    }
}
