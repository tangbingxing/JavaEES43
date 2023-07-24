package com.tangbingxing.exam1;

/**
 * 1.定义一个抽象类Door（门），具有开open( )和close（）方法，无返回值，无参数
 * 2.定义一个接口Lock（锁），具有上锁lockUp()和开锁openLock()方法，无返回值，无参数
 * 3.定义一个接口DoorBell（门铃），具有拍照存档takePictures()方法，无返回值，无参数
 * 4.定义防盗门TheftoroofDoor类，具有普通门的开和关的功能，同时还有上锁、开锁、按门铃拍照存档的能力
 * 5.创建测试类Test01,在main方法中测试以上功能，打印格式如下：
 * @Classname Test1
 * @Description 测试类
 * @Version 1.0.0
 * @Date 2023/7/22 9:39
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        TheftoroofDoor door = new TheftoroofDoor();
        door.close();
        door.lockup();
        door.takePictures();
        door.openLock();
        door.open();
    }
}
