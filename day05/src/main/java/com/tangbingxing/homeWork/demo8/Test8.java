package com.tangbingxing.homeWork.demo8;

import java.util.Arrays;

/**
 * 请在`replaceX`方法中将所有连续出现的数字替换成字母`X`
 * 请在`splitBySpace`方法中根据所有连续出现的空格或者制表符`\t`作为分隔符，将字符串分隔成数组
 * 请在`removeDuplicate`方法中将所有重复出现的字符替换成单个字符
 * @Classname Test8
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 16:59
 * @Created by m1346
 */

public class Test8 {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("aaabbacc"));
        System.out.println(Arrays.toString(splitBySpace("aa  bb  cc")));
        System.out.println(replaceX("1112213"));
    }
    // 去掉重复的字并返回
    public static String removeDuplicate(String input) {
        return input.replaceAll("(.)\\1+","$1");
    }

    // 按空格分割字符串并返回
    public static String[] splitBySpace(String input) {
        return input.split("(\\s+) | (\\t+) ");
    }

    // 将所有连续出现的数字替换成字母X并返回
    public static String replaceX(String input) {
        return input.replaceAll("(\\d)\\1+","X");
    }
}
