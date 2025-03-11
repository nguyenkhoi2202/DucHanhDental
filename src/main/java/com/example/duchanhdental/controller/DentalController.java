package com.example.duchanhdental.controller;

import com.example.duchanhdental.model.LoginRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DentalController {

    private Logger logger = LoggerFactory.getLogger(DentalController.class);


    @PostMapping("/login")
    public ResponseEntity<?> importMessage(@RequestBody LoginRequest request) throws Exception {
        logger.info("Request from client: {}" , "");

        return ResponseEntity.status(200).body("response");
    }

}
