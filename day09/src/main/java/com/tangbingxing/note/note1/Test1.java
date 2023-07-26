package com.tangbingxing.note.note1;

import java.io.UnsupportedEncodingException;

/**
 * 使用Java代码完成编码和解码的操作
 * @Classname Test1
 * @Description 笔记1
 * @Version 1.0.0
 * @Date 2023/7/25 16:26
 * @Created by m1346
 */

public class Test1 {
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
