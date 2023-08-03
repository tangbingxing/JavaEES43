package com.tangbingxing.test2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Classname Client
 * @Description 客户端  实现文件上传
 * @Version 1.0.0
 * @Date 2023/7/31 16:44
 * @Created by m1346
 */

public class Client {
    public static void main(String[] args) throws Exception{
        //创建Socket对象，指定服务器的地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);

        //获取到输出流对象
        OutputStream os = socket.getOutputStream();

        //创建输入流，读取本地文件
        FileInputStream fis = new FileInputStream("day13\\Client\\mm.jpg");
        //通过输出流，上传本地文件到服务器
        int len;
        byte[] bytes = new byte[8192];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        //告诉服务器已传输完毕,禁用输出流对象，否则服务器将一直处于阻塞状态
        socket.shutdownOutput();

        //读取服务器的回传信息
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String msg = dis.readUTF();
        System.out.println("msg = " + msg);

        //上传完成后，要将其关闭
        dis.close();
        //is.close();   // socket关闭后，会自动关闭输入输出流对象
        fis.close();
        //os.close();   // socket关闭后，会自动关闭输入输出流对象
        socket.close();
    }
}
