package com.blogapi.week6_spring_blog_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.blogapi.week6_spring_blog_api.repository.*;
import com.blogapi.week6_spring_blog_api.model.entity.*;
import com.blogapi.week6_spring_blog_api.exception.ResourceNotFoundException;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository comRepo;
    private final PostRepository postRepo;

    public Comment add(Long postId, Comment c){

        Post post = postRepo.findById(postId)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found"));

        c.setPost(post);
        return comRepo.save(c);
    }
}
