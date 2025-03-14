package com.example.duchanhdental.service;

import com.example.duchanhdental.model.UserLoginData;

import java.util.Map;

public interface AuthenService {
    Map<String, String> login(UserLoginData request);
}
