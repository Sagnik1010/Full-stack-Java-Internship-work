package com.ecommerce.controller;

import com.ecommerce.model.dto.*;
import com.ecommerce.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final JwtTokenProvider provider;

    @PostMapping("/login")
    public JwtResponse login(@RequestBody LoginRequest req){
        // (In real case validate password)
        return new JwtResponse(provider.createToken(req.username));
    }
}

