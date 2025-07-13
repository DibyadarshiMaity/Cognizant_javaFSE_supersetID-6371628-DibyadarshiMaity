package com.cognizant.learning6.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String msg() {
        return "Welcome to World...";
    }
}