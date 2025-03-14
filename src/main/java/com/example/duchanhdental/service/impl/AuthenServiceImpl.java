package com.example.duchanhdental.service.impl;

import com.example.duchanhdental.entity.User;
import com.example.duchanhdental.model.UserLoginData;
import com.example.duchanhdental.repository.UserRepository;
import com.example.duchanhdental.service.AuthenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthenServiceImpl implements AuthenService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public Map<String, String> login(UserLoginData request) {
        User user = userRepository.findByUserName(request.getUserName()).orElse(null);
        if (user != null && user.getPassWord().equals(request.getPassword())) {
            //String token = jwtUtil.generateToken(request.getUserName());
            Map<String, String> response = new HashMap<>();
            //response.put("token", token);
            response.put("UserName", user.getUserName());
            response.put("PassWord", user.getPassWord());
            response.put("FullName", user.getFullName());
            response.put("Address", user.getAddress());
            response.put("Phone", user.getPhone());
            response.put("RoleId", user.getRoleId());
            return  response;
        }
        return null;
    }
}
