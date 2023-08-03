package com.tangbingxing.note.note6;

import com.tangbingxing.homeWork.demo7.Student;

import java.io.*;
import java.util.ArrayList;

/**
 * @Classname Test6
 * @Description 笔记6
 * @Version 1.0.0
 * @Date 2023/7/27 20:02
 * @Created by m1346
 */

public class Test6 {
    public static void main(String[] args) {
        //创建ArrayList集合,添加学生对象
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "123456789", 20, 4.5));
        students.add(new Student("Petr", "987654321", 19, 4.0));
        students.add(new Student("Sidor", "123456789", 18, 3.5));

        try (//创建序列化流对象，指定目标文件路径
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10\\student.dat"));
        ) {
            //写对象集合到文件中
            oos.writeObject(students);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (//创建反序列化流对象，指定源文件路径
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10\\student.dat"));
        ) {
            //读取文件中的集合对象
            ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
            list.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
