package com.example.duchanhdental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DucHanhDentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(DucHanhDentalApplication.class, args);
    }

}
