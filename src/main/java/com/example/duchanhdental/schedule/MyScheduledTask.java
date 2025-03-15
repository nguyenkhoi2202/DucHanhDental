package com.example.duchanhdental.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyScheduledTask {

    @Scheduled(cron = "0 * * * * *") // Chạy mỗi phút
    public void runTask() {
        System.out.println("Chạy tác vụ mỗi phút: " + new Date());
    }
}