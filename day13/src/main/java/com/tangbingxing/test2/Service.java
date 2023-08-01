package com.tangbingxing.test2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname Service
 * @Description 服务端  接收上传的文件
 * @Version 1.0.0
 * @Date 2023/7/31 16:45
 * @Created by m1346
 */

public class Service {
    public static void main(String[] args) throws Exception{
        //创建ServerSocket对象，指定服务端端口
        ServerSocket ss = new ServerSocket(8888);

        //通过accept()方法， 接收到客户端的套接字对象
        Socket socket = ss.accept();

        //获取到输入流对象
        InputStream is = socket.getInputStream();

        // 创建文件输出流对象
        FileOutputStream fos = new FileOutputStream("day13\\Server\\mmCopy.jpg");
        // 创建数组,用于存储客户端发送过来的信息
        byte[] buffer = new byte[1024];
        int len = 0;
        //通过输入流对象读取客户端发送的数据
        while ((len = is.read(buffer)) != -1) {
            //写入数据到服务端的输出流对象中
            fos.write(buffer, 0, len);
        }
        //写入完成后，回写信息给客户端
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("上传完成");
        //os.write("上传完成".getBytes());

        //关闭资源
        dos.close();
        //os.close();   //socket获取的流会随着socket的关闭自动关闭
        fos.close();
        //is.close();   //socket获取的流会随着socket的关闭自动关闭
        socket.close();
        ss.close();
    }
}
