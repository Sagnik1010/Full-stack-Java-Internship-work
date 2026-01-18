package com.blogapi.week6_spring_blog_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blogapi.week6_spring_blog_api.model.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
