package com.sangjae.rdpoject.domain;

import java.io.Serializable;

import static com.sangjae.rdpoject.domain.UserRole.*;

public class User implements Serializable {
    // 유저
    private int userCode;
    private String userId;
    private String userPassword;
    private String phoneNumber;
    private UserRole userRole;
    private int money;


    public User(int userCode, String userId, String userPassword, String phoneNumber, UserRole userRole,int money) {
        this.userCode = userCode;
        this.userId = userId;
        this.userPassword = userPassword;
        this.phoneNumber = phoneNumber;
        this.money = money;
        this.userRole = userRole;
    }

    public User(int userCode, String userId, String userPassword ,String phoneNumber) {
        this(userCode, userId, userPassword, phoneNumber, USER , 0);
    }

    public void updateMoney(int money){
        this.money += money;
    }


    public int getUserCode() {
        return userCode;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public int getMoney() {
        return money;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserRole getUserRole() {
        return userRole;
    }


    @Override
    public String toString() {
        return "User{" +
                "userCode=" + userCode +
                ", userId='" + userId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userRole=" + userRole +
                ", money=" + money +
                '}';
    }

}
