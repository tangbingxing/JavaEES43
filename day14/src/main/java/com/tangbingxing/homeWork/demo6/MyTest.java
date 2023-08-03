package com.tangbingxing.homeWork.demo6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Classname MyTest
 * @Description 注解1
 * @Version 1.0.0
 * @Date 2023/8/2 16:28
 * @Created by m1346
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {
    String value();
    double aaa() default 100;
    String[] bbb();
}
