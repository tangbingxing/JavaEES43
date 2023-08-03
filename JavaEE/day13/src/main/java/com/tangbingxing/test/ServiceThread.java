package com.tangbingxing.test;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 * @Classname ServiceThread
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/31 15:33
 * @Created by m1346
 */

public class ServiceThread extends Thread{
    private Socket socket;

    public ServiceThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //
        while (true) {
            try {
                //接收数据
                InputStream is = socket.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                    /*int b;
                    while ((b = is.read()) != -1) {
                        System.out.println(b);
                    }*/
                System.out.println(dis.readUTF());
            } catch (Exception e) {
                System.out.println("服务端已退出!");
                break;
            }
        }
    }
}
