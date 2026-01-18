package com.blogapi.week6_spring_blog_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.blogapi.week6_spring_blog_api.service.CategoryService;
import com.blogapi.week6_spring_blog_api.model.entity.Category;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;

    @PostMapping
    public Category create(@RequestBody Category c){
        return service.create(c);
    }

    @GetMapping
    public List<Category> all(){
        return service.all();
    }
}

