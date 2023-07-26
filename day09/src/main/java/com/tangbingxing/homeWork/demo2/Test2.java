package com.tangbingxing.homeWork.demo2;

import java.io.UnsupportedEncodingException;

/**
 * 请在encoding中完成字符串的编码，参数为要编码的内容和字符集
 * 请在decoding中完成字符串的解码，参数为要解码的内容和字符集
 * @Classname Test2
 * @Description 作业题2
 * @Version 1.0.0
 * @Date 2023/7/25 15:41
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "abcABC";
        byte[] encode = encoding(s, "UTF-8");
        for (byte b : encode) {
            System.out.println(b);
        }
        String decode = decoding(encode, "UTF-8");
        System.out.println(decode);

        byte[] encode1 = encoding(s, "GBK");
        for (byte b : encode) {
            System.out.println(b);
        }
        String decode1 = decoding(encode, "GBK");
        System.out.println(decode);
    }

    /**
     * 编码
     * @param content 要编码的字符内容
     * @param charsetName 字符集
     * @return 解码后的字节数组
     */
    static byte[] encoding(String content,String charsetName){
        return content.getBytes();
    }

    /**
     *解码
     * @param content 要解码的字节内容
     * @param charsetName 字符集
     * @return 解码后的字符串
     * @throws UnsupportedEncodingException
     */
    static String decoding(byte[] content,String charsetName) throws UnsupportedEncodingException {
        return new String(content,charsetName);
    }
}
