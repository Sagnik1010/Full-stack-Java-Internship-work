package com.ecommerce.controller;

import com.ecommerce.service.UserService;
import com.ecommerce.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping
    public User create(@RequestBody User u){
        return service.save(u);
    }
}
