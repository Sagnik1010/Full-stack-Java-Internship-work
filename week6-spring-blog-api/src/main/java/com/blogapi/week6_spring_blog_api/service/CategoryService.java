package com.blogapi.week6_spring_blog_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.blogapi.week6_spring_blog_api.repository.CategoryRepository;
import com.blogapi.week6_spring_blog_api.model.entity.Category;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repo;

    public Category create(Category c){
        return repo.save(c);
    }

    public List<Category> all(){
        return repo.findAll();
    }
}
