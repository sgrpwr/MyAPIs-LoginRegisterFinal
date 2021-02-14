package com.sagar.model;

public class UserLogin {
    private String userName="John";
    private String userPasswd;

    public String getUserName() {
        return userName;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "userName=" + userName +
                ", userPassword=" + userPasswd +
                '}';
    }
}
