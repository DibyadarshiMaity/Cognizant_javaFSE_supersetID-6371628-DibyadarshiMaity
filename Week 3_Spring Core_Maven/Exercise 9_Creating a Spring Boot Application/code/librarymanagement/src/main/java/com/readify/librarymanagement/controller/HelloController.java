package com.readify.librarymanagement.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{

    @GetMapping("/")
    public String home() 
    {
        return "Library Management App is running!";
    }
}

