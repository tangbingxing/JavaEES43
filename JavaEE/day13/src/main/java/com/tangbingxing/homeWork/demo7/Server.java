package com.tangbingxing.homeWork.demo7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname Server
 * @Description 服务端
 * @Version 1.0.0
 * @Date 2023/7/31 19:49
 * @Created by m1346
 */

public class Server {
    //List集合
    public static void main(String[] args) throws Exception {
        ArrayList<String> students = new ArrayList<>();
        Collections.addAll(students, "张三", "李四", "王五", "赵六","张无忌","赵敏");

        //创建ServerSocket接口
        ServerSocket ss = new ServerSocket(8888);
        //创建套接字对象
        Socket socket = ss.accept();
        //获取套接字对象的输入流
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String msg = dis.readUTF();

        //创建stream流,处理集合里的元素
        List<String> collect = students.stream().filter(s -> s.startsWith(msg)).collect(Collectors.toList());

        //将处理后的集合放入到socket对象的输出流中
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF(String.join(",", collect));
        socket.close();
    }
}
