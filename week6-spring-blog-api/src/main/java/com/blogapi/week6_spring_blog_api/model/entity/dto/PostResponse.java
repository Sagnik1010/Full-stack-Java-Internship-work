package com.blogapi.week6_spring_blog_api.model.entity.dto;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
public class PostResponse {
    private Long id;
    private String title;
    private String content;
    private String author;
    private String category;
}

