package com.tangbingxing.note.demo1;

import org.junit.*;

/**
 * 使用Junit进行单元测试
 * @Classname Test1
 * @Description 笔记1
 * @Version 1.0.0
 * @Date 2023/8/3 16:14
 * @Created by m1346
 */

public class Test1 {
    //Junit是第三方开源框架，需要先导包
    //使用@Test注解

    @Test
    public void test1(){
        show();
    }

    @Test
    public void test2(){
        int sum = sum(10, 20);
        System.out.println("sum = " + sum);
    }


    // 业务方法
    public void show(){
        System.out.println("show...");
    }

    public int sum(int num1,int num2){
        System.out.println("sum...");
        return num1 + num2;
    }

    @BeforeClass
    public static void bc(){
        System.out.println("@BeforeClass...bc...");
    }

    // 定义一个静态方法,使用@AfterClass注解修饰
    @AfterClass
    public static void ac(){
        System.out.println("@AfterClass...ac...");
    }

    // 定义一个实例方法,使用@Before注解修饰
    @Before
    public void b1(){
        System.out.println("@Before...b1...");
    }

    // 定义一个实例方法,使用@After注解修饰
    @After
    public void a1(){
        System.out.println("@After...a1...");
    }

    // 定义一个测试方法,使用@Test注解修饰
    @Test
    public void test3(){
        System.out.println("test3...");
    }

    @Test
    public void test4(){
        System.out.println("test4...");
    }


}
