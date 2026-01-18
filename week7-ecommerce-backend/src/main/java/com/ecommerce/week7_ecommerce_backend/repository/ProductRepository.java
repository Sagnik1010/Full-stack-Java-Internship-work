package com.ecommerce.week7_ecommerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByNameContaining(String name);
}

