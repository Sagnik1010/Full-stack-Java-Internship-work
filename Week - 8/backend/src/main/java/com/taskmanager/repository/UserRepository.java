package com.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.taskmanager.model.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Find user by username for authentication
    Optional<User> findByUsername(String username);
}