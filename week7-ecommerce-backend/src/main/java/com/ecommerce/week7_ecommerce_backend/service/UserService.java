package com.ecommerce.week7_ecommerce_backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.ecommerce.week7_ecommerce_backend.repository.UserRepository;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.User;
import com.ecommerce.week7_ecommerce_backend.model.dto.UserDTO;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    public User register(UserDTO dto){
        User u = new User();
        u.setName(dto.name);
        u.setEmail(dto.email);
        u.setPassword(dto.password);
        return repo.save(u);
    }
}
