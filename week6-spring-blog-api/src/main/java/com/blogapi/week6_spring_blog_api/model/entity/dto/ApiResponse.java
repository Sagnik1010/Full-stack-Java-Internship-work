package com.blogapi.week6_spring_blog_api.model.entity.dto;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
public class ApiResponse {
    private String message;
    private boolean success;
}
