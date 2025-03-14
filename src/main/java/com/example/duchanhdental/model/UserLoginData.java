package com.example.duchanhdental.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


public class UserLoginData {
    @JsonProperty(value = "UserName")
    private String userName;
    @JsonProperty(value = "Password")
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
