package com.tangbingxing.homeWork.demo7;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * @Classname MyQune
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/20 16:26
 * @Created by m1346
 */

public class MyQueue<E> {
    LinkedList<E> list = new LinkedList<E>();

    //将给定的元素添加到队列的末尾
    public void enqueue(E element) {
        list.addLast(element);
    }

    //删除并返回队列的第一个元素。如果队列为空，则抛出NoSuchElementException异常
    public E dequeue(){
        E e = null;
        if (list.isEmpty()){
            throw new NoSuchElementException();
        } else {
            e = list.removeFirst();
        }
        return e;
    }

    //返回队列的第一个元素。如果队列为空，则抛出NoSuchElementException异常。
    public E peek() {
        E e = null;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            e = list.getFirst();
        }
        return e;
    }

    //返回队列中的元素数量
    public int size() {
        int size = list.size();
        return size;
    }

    //果队列为空，则返回true，否则返回false
    public boolean isEmpty() {
        boolean isEmpty = list.isEmpty();
        return isEmpty;
    }
}
