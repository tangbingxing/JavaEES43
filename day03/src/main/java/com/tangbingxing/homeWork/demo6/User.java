package com.tangbingxing.homeWork.demo6;

/**
 * @Classname User
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/7/14 18:08
 * @Created by m1346
 */

public class User implements Cloneable {
    private String id; //编号
    private String username; //用户名
    private String password; //密码
    private double[] scores; //分数

    public User() {
    }

    public User(String id, String username, String password, double[] scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
