package com.ecommerce.service;

import com.ecommerce.repository.UserRepository;
import com.ecommerce.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repo;
    public User save(User u){ return repo.save(u); }
}
