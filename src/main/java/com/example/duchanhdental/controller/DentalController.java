package com.example.duchanhdental.controller;

import com.example.duchanhdental.service.DentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dental")
public class DentalController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, JWT!";
    }

}
