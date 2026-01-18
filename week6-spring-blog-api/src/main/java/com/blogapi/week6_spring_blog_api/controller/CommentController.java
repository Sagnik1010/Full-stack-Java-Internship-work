package com.blogapi.week6_spring_blog_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.blogapi.week6_spring_blog_api.service.CommentService;
import com.blogapi.week6_spring_blog_api.model.entity.Comment;

@RestController
@RequestMapping("/api/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService service;

    @PostMapping("/{postId}")
    public Comment add(@PathVariable Long postId, @RequestBody Comment c){
        return service.add(postId, c);
    }
}
