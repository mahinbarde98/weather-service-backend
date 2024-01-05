package com.cts.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class UserCredentials {
    @Id
    String username;
    String password;

    public UserCredentials() {
    }

    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

}