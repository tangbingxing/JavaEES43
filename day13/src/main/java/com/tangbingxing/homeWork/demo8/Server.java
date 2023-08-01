package com.tangbingxing.homeWork.demo8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @Classname Server
 * @Description 服务端
 * @Version 1.0.0
 * @Date 2023/7/31 20:09
 * @Created by m1346
 */

public class Server {
    public static void main(String[] args) throws Exception {
        LinkedList<String> movies = new LinkedList<>();
        //创建文件对象,关联文件路径
        File file = new File("day13\\Server");
        //获取该文件对象下的所有文件名
        String[] list = file.list();
        if (list != null) {
            Collections.addAll(movies, list);
        }

        //创建服务端的Socket对象
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();

        while (true) {
            try {
                //获取socket的输入流
                InputStream is = socket.getInputStream();
                //包装成数据流
                DataInputStream dis = new DataInputStream(is);
                String choice = dis.readUTF();
                OutputStream os = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                switch (choice) {
                    case "00":
                        //将集合传给客户端
                        dos.writeUTF(String.join("\r\n",movies));
                        continue;
                    case "exit":
                        // 退出服务
                        System.out.println("客户端退出服务");
                        //释放资源
                        socket.close();
                        ss.close();
                        break;
                    default:
                        //创建字节输入流，读取电影文件
                        FileInputStream fis = new FileInputStream("day13\\Server\\" + choice);
                        //输出到客户端
                        byte[] bytes = new byte[8192];
                        int length;
                        while ((length = fis.read(bytes)) != -1) {
                            dos.write(bytes, 0, length);
                        }
                        System.out.println("传输完成");
                        socket.shutdownOutput();
                }
            } catch (IOException e) {
                //throw new RuntimeException(e);
                System.out.println(socket.getRemoteSocketAddress() + "客户端已断开连接");
                break;
            }
        }
    }
}
