package com.tangbingxing.exam1;

/**
 * @Classname Lock
 * @Description 锁
 * @Version 1.0.0
 * @Date 2023/7/22 9:42
 * @Created by m1346
 */

public interface Lock {
    //上锁方法
    void lockup();
    //开锁方法
    void openLock();
}
