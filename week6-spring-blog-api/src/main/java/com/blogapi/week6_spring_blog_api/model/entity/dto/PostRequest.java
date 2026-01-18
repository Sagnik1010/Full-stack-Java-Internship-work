package com.blogapi.week6_spring_blog_api.model.entity.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter @Setter
public class PostRequest {

    @NotNull
    private String title;

    @NotNull
    private String content;

    private String author;

    @NotNull
    private Long categoryId;
}

