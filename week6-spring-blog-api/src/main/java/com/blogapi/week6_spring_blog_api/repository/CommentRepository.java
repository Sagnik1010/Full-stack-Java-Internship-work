package com.blogapi.week6_spring_blog_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blogapi.week6_spring_blog_api.model.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
