package com.example.JournalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journal")
public class HealthCheck {
    @GetMapping("/health")
    public String myHealthCheck()
    {
        return "Up and Running";
    }
}
