package com.cts.model;

import java.util.Arrays;

public class JwtResponse {
    String token;
    String [] role;

    public JwtResponse(String token, String[] role) {
        this.token = token;
        this.role = role;
    }

    public JwtResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String[] getRole() {
        return role;
    }

    public void setRole(String[] role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "JwtResponse{" +
                "token='" + token + '\'' +
                ", role=" + Arrays.toString(role) +
                '}';
    }
}
