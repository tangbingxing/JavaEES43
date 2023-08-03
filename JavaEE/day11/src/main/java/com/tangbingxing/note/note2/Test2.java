package com.tangbingxing.note.note2;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.util.List;

/**
 * @Classname Test2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/28 21:21
 * @Created by m1346
 */

public class Test2 {
    public static void main(String[] args) throws Exception{
        //创建解析器对象
        SAXReader sr = new SAXReader();
        //解析xml文件为D对象
        Document document = sr.read(new FileInputStream("day11\\src\\test.xml"));
        //获取根元素
        Element rootE = document.getRootElement();

        //获取根元素下的子元素
        Element order = rootE.element("订单");
        String data = order.element("下单日期").getText();
        Element info = order.element("收件人地址信息");
        String name = info.element("收件人名称").getText();
        String address = info.element("收件人地址").getText();
        List<Element> itemList = order.elements("商品");
        System.out.println("下单日期: " + data + "\n收件人名称: " + name + "\n收件人地址: " + address);
        for (Element e : itemList) {
            String itemName = e.element("商品名称").getText();
            int number = Integer.parseInt(e.element("购买数量").getText());
            double price = Double.parseDouble(e.element("商品单价金额").getText());
            System.out.println("商品名称:" + itemName + "\t购买数量:" + number + "\t商品单价金额:" + price);
        }
    }
}
