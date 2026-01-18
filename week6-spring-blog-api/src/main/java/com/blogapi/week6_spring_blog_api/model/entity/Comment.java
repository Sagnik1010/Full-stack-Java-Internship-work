package com.blogapi.week6_spring_blog_api.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String content;

    private String author;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;
}
