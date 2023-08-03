package com.tangbingxing.homeWork.demo10;

/**
 * @Classname Task
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/14 19:57
 * @Created by m1346
 */

public class Task {
    public static void main(String[] args) throws InvalidOperatorException {
        double res = calculate('/', 1, 0);
        System.out.println(res);

    }

    static double calculate(char operator, int v1, int v2) throws InvalidOperatorException {
        double num;
        switch (operator) {
            case '+':
                num = v1 + v2;
                break;
            case '-':
                num = v1 - v2;
                break;
            case '*':
                num = v1 * v2;
                break;
            case '/':
                if (v2 != 0) {
                    num = v1 + v2;
                } else {
                    throw new DivisionByZeroException("除数不能为零");
                }
                break;
            default:
                throw new InvalidOperatorException("无效数据");
        }
        return num;
    }
    static class DivisionByZeroException extends RuntimeException {

        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    static class InvalidOperatorException extends Exception {
        public InvalidOperatorException(String message) {
            super(message);
        }
    }
}
