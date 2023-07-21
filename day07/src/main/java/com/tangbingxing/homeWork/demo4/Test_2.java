package com.tangbingxing.homeWork.demo4;

import java.util.HashSet;
import java.util.Random;
import java.util.StringJoiner;

/**
 * @Classname Test_2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 17:48
 * @Created by m1346
 */

public class Test_2 {
    public static void main(String[] args) {
        //双色球规则，双色球每注投注号码由6个1—33的号码和1个1—16的号码组成。其中6个1-33的数字要求不能重复。请随机生成一注双色球号码。
        Random random = new Random();
        HashSet<Integer> num = new HashSet<>();
        //定义一个StringJoiner对象，拼接生成的号码
        StringJoiner part1 = new StringJoiner("-");
        //生成6个不重复的号码
        for (int i = 0; i < 6; i++) {
            int r = random.nextInt(1, 33);
            //判断号码是否与之前的重复，重复则不存
            if (!num.add(r)) {
                i--;
            } else {
                part1.add(String.valueOf(r));
            }
        }
        //生成最后一个元素
        int r = random.nextInt(1,16);
        //将随机生成的双色球号码打印输出
        System.out.println(part1.add(String.valueOf(r)));
    }
}
