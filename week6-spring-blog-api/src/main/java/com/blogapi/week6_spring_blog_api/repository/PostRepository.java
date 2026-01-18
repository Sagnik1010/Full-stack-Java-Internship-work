package com.blogapi.week6_spring_blog_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blogapi.week6_spring_blog_api.model.entity.Post;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByAuthor(String author);
}
