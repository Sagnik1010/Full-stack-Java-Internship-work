package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
public class Tenant {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
}

