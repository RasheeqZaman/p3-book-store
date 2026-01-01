package com.wolftech.bookstore.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @PostMapping("/login")
    public String login(@RequestBody String entity) {
        return entity;
    }
    
    @PostMapping("/register")
    public String register(@RequestBody String entity) {
        return entity;
    }
    
}
