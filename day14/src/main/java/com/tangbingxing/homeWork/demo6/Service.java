package com.tangbingxing.homeWork.demo6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Classname Service
 * @Description 注解2
 * @Version 1.0.0
 * @Date 2023/8/2 16:32
 * @Created by m1346
 */

@Target({ElementType.TYPE, ElementType.METHOD}) // 当前被修饰的注解只能用在类上，方法上。
@Retention(RetentionPolicy.RUNTIME) // 控制下面的注解一直保留到运行时
public @interface Service {
    String value() default "";
}
