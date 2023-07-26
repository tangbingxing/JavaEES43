package com.tangbingxing.note.note3;

/**
 * 使用Stream流的常用方法 操作数据
 * @Classname Test3
 * @Description 笔记3
 * @Version 1.0.0
 * @Date 2023/7/24 17:25
 * @Created by m1346
 */

public class Test3 {
    public static void main(String[] args) {
    //stream流的获取方法
        //Collection集合，接口中有默认方法stream，直接调用
        //Map集合可先通过keySet或entrySet获取一个Set集合，再通过Set集合获取
        //数组可通过Arrays工具类中的静态方法stream()生成流
        //可使用Stream.of(T...values)，传入一个可变参数生成流

    //stream流的中间方法
        //过滤 filter
        //跳过前几个  skip
        //截取前几个  limit
        //映射 map
        //合并 concat
        //去重 distinct

    //stream流的终结方法
        //遍历 forEach
        //收集 collect
        //统计个数 count
        //最大值 max
        //最小值 min
    }
}
