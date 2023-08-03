package com.tangbingxing.homeWork.demo6;

/**
 * @Classname Demo
 * @Description Demo类
 * @Version 1.0.0
 * @Date 2023/8/2 16:33
 * @Created by m1346
 */

@Service("userService")
@MyTest(value = "蜘蛛精", aaa = 99.5, bbb = {"至尊宝", "黑马"})
public class Demo {
    @MyTest(value = "孙悟空", aaa = 199.9, bbb = {"紫霞", "牛夫人"})
    public void test1() {
    }
}
