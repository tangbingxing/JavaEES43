package com.tangbingxing.homeWork.demo2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Classname Test_3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 16:40
 * @Created by m1346
 */

public class Test_3 {
    //请编写斗地主洗牌发牌程序
    public static void main(String[] args) {

        //创建牌
        ArrayList<String> card = new ArrayList<>();
        //创建牌的点数
        String[] num = {"3","4","5","6","7","8","9","10","Q","J","k","A","2"};
        //创建牌的花色
        String[] color = {"方块","红桃","红心","黑桃"};
        //将牌的点数和花色嵌套
        for (int i = 0; i < num.length; i++) {
            for (int i1 = 0; i1 < color.length; i1++) {
                String card1 = color[i1] + num[i];
                card.add(card1);
            }
        }
        //加入大小牌，组成整套牌
        card.add("小王");
        card.add("大王");
        System.out.println(card);
        System.out.println(card.size());

        //洗牌
        //使用Collections的shuffle方法,将整套牌的顺序打乱
        Collections.shuffle(card);
        System.out.println(card);

        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> lastCard = new ArrayList<>();

        //发牌
        for (int i = 0; i < card.size(); i++) {
            if (i <= 51){
                //3个人轮流发牌
                if (i%3 == 0){
                    play1.add(card.get(i));
                } else if (i%3 == 1) {
                    play2.add(card.get(i));
                } else {
                    play3.add(card.get(i));
                }
            } else {
                //最后剩3张牌作为底牌
                lastCard.add(card.get(i));
            }
        }

        System.out.println("玩家1的牌"+play1);
        System.out.println("玩家2的牌"+play2);
        System.out.println("玩家3的牌"+play3);
        System.out.println("最后的牌"+lastCard);
    }
}
