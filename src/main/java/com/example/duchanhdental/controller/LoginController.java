package com.example.duchanhdental.controller;

import com.example.duchanhdental.model.UserLoginData;
import com.example.duchanhdental.service.AuthenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    private AuthenService authenService;

    private Logger logger = LoggerFactory.getLogger(LoginController.class);


    @PostMapping("/login")
    public ResponseEntity<?> importMessage(@RequestBody UserLoginData req) {
        logger.info("Request from client: {}" , "");

        if (req.getUserName().isEmpty() || req.getPassword().isEmpty()){
            return ResponseEntity.status(400).body("Data error");
        }
        Map<String, String> response =  authenService.login(req);
        if (response != null){
            return ResponseEntity.status(200).body(response);
        }

        return ResponseEntity.status(401).body("Unthorization");
    }

}
