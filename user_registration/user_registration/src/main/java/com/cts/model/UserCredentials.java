package com.cts.model;

public class UserCredentials {

    String username;
    String password;

    public UserCredentials() {
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

    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

}