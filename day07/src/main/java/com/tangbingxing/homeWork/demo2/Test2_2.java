package com.tangbingxing.homeWork.demo2;

import java.util.HashMap;

/**
 * @Classname Test2_2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/21 16:27
 * @Created by m1346
 */

public class Test2_2 {
//   有以下字符串：
//   String str = “fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew”;
//   请编程统计每个字符出现的次数
    public static void main(String[] args) {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        //创建HashMap集合，键存字符，值存出现次数
        HashMap<Character, Integer> map = new HashMap<>();
        //遍历字符串中的每个字符
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char word = charArray[i];
            //判断集合中的键是否有该字符
            if (!map.containsKey(word)) {
                // 没有则存入，记次数为1
                map.put(word,1);
            } else {
                //有则将次数加1
                map.put(word,map.get(word) + 1);
            }
        }
        map.forEach((k,v)->{
            System.out.println(k + "->" + v);
        });
    }
}
