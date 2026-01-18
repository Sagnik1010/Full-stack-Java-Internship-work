package com.blogapi.week6_spring_blog_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import com.blogapi.week6_spring_blog_api.service.PostService;
import com.blogapi.week6_spring_blog_api.model.dto.*;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService service;

    @PostMapping
    public PostResponse create(@Valid @RequestBody PostRequest req){
        return service.create(req);
    }

    @GetMapping
    public List<PostResponse> all(){
        return service.all();
    }
}

