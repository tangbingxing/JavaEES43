package com.tangbingxing.exam1;

/**
 * @Classname TheftoroofDoor
 * @Description 防盗门
 * @Version 1.0.0
 * @Date 2023/7/22 9:45
 * @Created by m1346
 */

public class TheftoroofDoor extends Door implements Lock,DoorBell{
    @Override
    void open() {
        System.out.println("用力推，门打开了。");
    }

    @Override
    void close() {
        System.out.println("轻轻拉门，门关上了。");
    }

    @Override
    public void takePictures() {
        System.out.println("铃.......咔嚓.......拍照已存储");
    }

    @Override
    public void lockup() {
        System.out.println("插进钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙。");
    }

    @Override
    public void openLock() {
        System.out.println("插进钥匙，向右旋转钥匙三圈，锁打开了，拔出钥匙。");
    }
}
