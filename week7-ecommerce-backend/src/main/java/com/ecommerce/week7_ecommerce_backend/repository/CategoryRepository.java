package com.ecommerce.week7_ecommerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {}
