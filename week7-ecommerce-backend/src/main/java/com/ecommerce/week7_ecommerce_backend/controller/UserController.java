package com.ecommerce.week7_ecommerce_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.week7_ecommerce_backend.service.UserService;
import com.ecommerce.week7_ecommerce_backend.model.dto.UserDTO;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.User;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public User register(@RequestBody UserDTO dto){
        return service.register(dto);
    }
}

