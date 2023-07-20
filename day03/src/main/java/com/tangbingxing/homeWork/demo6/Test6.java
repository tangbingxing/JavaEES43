package com.tangbingxing.homeWork.demo6;

/**
 * @Classname Test6
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/14 18:08
 * @Created by m1346
 */

public class Test6 {
    public static void main(String[] args) {
        double[] score = {78.9,85,2,84.3};
        User user = new User("1","Tom","123456",score);
        try {
            //1.先浅克隆
            User userCopy = (User) user.clone();
            //2.再克隆对象中的引用类型,并将其赋值给克隆后的对象
            double[] scoresCopy = user.getScores().clone();
            userCopy.setScores(scoresCopy);
        } catch (CloneNotSupportedException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
