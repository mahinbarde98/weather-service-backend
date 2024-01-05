package com.cts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class User {
    @Id
    private String username;
    private String password;
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String username, String userPassword, String name) {
        this.username = username;
        this.password = userPassword;
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + username + '\'' +
                ", userPassword='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
