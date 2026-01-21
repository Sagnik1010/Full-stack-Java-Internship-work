package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@Table(name="users")
public class User {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    @ManyToOne
    private Role role;

    @ManyToOne
    private Tenant tenant;
}
