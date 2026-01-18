package com.blogapi.week6_spring_blog_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.blogapi.week6_spring_blog_api.repository.*;
import com.blogapi.week6_spring_blog_api.model.dto.*;
import com.blogapi.week6_spring_blog_api.model.entity.*;
import com.blogapi.week6_spring_blog_api.exception.ResourceNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepo;
    private final CategoryRepository catRepo;

    public PostResponse create(PostRequest req){

        Category cat = catRepo.findById(req.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Category not found"));

        Post post = new Post();
        post.setTitle(req.getTitle());
        post.setContent(req.getContent());
        post.setAuthor(req.getAuthor());
        post.setCategory(cat);

        Post saved = postRepo.save(post);

        return new PostResponse(
                saved.getId(),
                saved.getTitle(),
                saved.getContent(),
                saved.getAuthor(),
                cat.getName()
        );
    }

    public List<PostResponse> all(){
        return postRepo.findAll().stream()
                .map(p -> new PostResponse(
                        p.getId(),
                        p.getTitle(),
                        p.getContent(),
                        p.getAuthor(),
                        p.getCategory().getName()
                ))
                .collect(Collectors.toList());
    }
}

