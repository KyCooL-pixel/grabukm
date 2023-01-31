package com.grabukm.Model;


public class User{
    private String userName;
    private String password;

    // create user by giving name and contact number
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getuserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}