package com.taskmanager.controller;

import com.taskmanager.model.entity.User;
import com.taskmanager.service.AuthService;
import lombok.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public User register(@RequestBody User u){
        return service.register(u);
    }

    @PostMapping("/login")
    public String login(@RequestBody User u){
        return service.login(u.getUsername(),u.getPassword());
    }
}
