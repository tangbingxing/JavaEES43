package com.tangbingxing.homeWork.demo7;

/**
 * @Classname IdInfo
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/18 19:57
 * @Created by m1346
 */

public class IdInfo {
    private String id;
    private String birthday;
    private int sex;//1:男, 0:女

    public IdInfo() {
    }

    public IdInfo(String id, String birthday, int sex) {
        this.id = id;
        this.birthday = birthday;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "IdInfo{" +
                "id='" + id + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex=" + sex +
                '}';
    }
}
