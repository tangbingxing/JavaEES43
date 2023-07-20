package com.tangbingxing.homeWork.demo9;

/**
 * @Classname Task
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/14 19:51
 * @Created by m1346
 */

public class Task {
    public static void main(String[] args) {
        String text = "";
        showTimeInfo(text);
    }

    private static String showTimeInfo(String s) {
        if (s.length() != 5) {
            throw new InvalidInputException("无效数据异常");
        }
        return s;
    }

    public static class InvalidInputException extends RuntimeException {
        public InvalidInputException() {
        }
        public InvalidInputException(String message) {
            super(message);
        }
    }
}
