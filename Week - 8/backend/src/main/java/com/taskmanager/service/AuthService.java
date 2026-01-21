package com.taskmanager.service;

import com.taskmanager.model.entity.User;
import com.taskmanager.repository.UserRepository;
import com.taskmanager.security.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository repo;
    private final JwtTokenProvider provider;

    public String login(String username,String password){
        User user = repo.findByUsername(username).orElseThrow();
        if(!user.getPassword().equals(password)) throw new RuntimeException("Bad credentials");
        return provider.createToken(username);
    }

    public User register(User u){
        return repo.save(u);
    }
}
