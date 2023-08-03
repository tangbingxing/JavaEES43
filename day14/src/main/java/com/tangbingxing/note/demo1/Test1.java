package com.tangbingxing.note.demo1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 使用Junit进行单元测试
 * @Classname Test1
 * @Description 笔记1
 * @Version 1.0.0
 * @Date 2023/8/3 16:14
 * @Created by m1346
 */

public class Test1 {
    public static void main(String[] args) {
        //Junit是第三方开源框架，需要先导包
        //使用@Test注解
    }

    @Test
    public void test1(){
        method1();
    }

    @Before
    public void test2() {
        method2();
    }

    @After
    public void test3() {
        method3();
    }

    void method1() {
        System.out.println("method1");
    }

    void method2() {
        System.out.println("method2");
    }

    void method3() {
        System.out.println("method3");
    }
}
