package com.ecommerce.week7_ecommerce_backend.model.enums.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter @Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private String name;

    @ManyToOne
    private Category parent;

    @OneToMany(mappedBy="parent")
    private List<Category> children;
}

