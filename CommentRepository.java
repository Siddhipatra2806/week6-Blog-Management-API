package com.blogapi.repository;

import com.blogapi.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    // Custom method to easily find all comments for a specific post
    List<Comment> findByPostId(Long postId);
}