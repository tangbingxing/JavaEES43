package com.tangbingxing.homeWork.demo6;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @Classname ClientRunnalbe
 * @Description 客户端线程
 * @Version 1.0.0
 * @Date 2023/7/31 21:31
 * @Created by m1346
 */

public class ClientRunnalbe implements Runnable {
    private Socket socket;

    public ClientRunnalbe(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                //读取客户端回写的数据
                InputStream is = socket.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                String msg = dis.readUTF();
                System.out.println(msg);
            } catch (IOException e) {
                //  如果出现异常就关闭该Socket
                System.out.println("取消服务器监听");
                //socket.close();
                break;
            }
        }
    }
}
