package com.tangbingxing.homeWork.demo7;

/**
 * @Classname Test7
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/20 16:09
 * @Created by m1346
 */

public class Test7 {
    public static void main(String[] args) {

        MyQueue<String> queue = new MyQueue<String>();
        queue.enqueue("Java");
        queue.enqueue("C++");
        queue.enqueue("Go");
        queue.enqueue("Python");

        System.out.println(queue.dequeue());

        System.out.println(queue.peek());

        System.out.println(queue.size());

        System.out.println(queue.isEmpty());
    }
}
