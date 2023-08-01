package com.tangbingxing.homeWork.demo3;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Classname Client
 * @Description 客户端
 * @Version 1.0.0
 * @Date 2023/7/31 17:48
 * @Created by m1346
 */

public class Client {
    public static void main(String[] args) throws Exception{
        //创建套接字对象
        Socket socket = new Socket("127.0.0.1", 8888);
        //获取套接字对象的输出流
        OutputStream os = socket.getOutputStream();
        String msg = "测试数据";
        //包装成数据流
        DataOutputStream dos = new DataOutputStream(os);
        //写入数据
        dos.writeUTF(msg);
        //释放资源
        socket.close();
    }
}
