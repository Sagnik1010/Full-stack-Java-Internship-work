package com.taskmanager.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@Table(name="users")
public class User {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private String username;

    private String password;
}

