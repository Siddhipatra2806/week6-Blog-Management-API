package com.blogapi.controller;

import com.blogapi.payload.CommentDto;
import com.blogapi.service.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class CommentController {
    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/posts/{postId}/comments")
    public CommentDto createComment(@PathVariable(value = "postId") long postId,
                                    @RequestBody CommentDto commentDto) {
        return commentService.createComment(postId, commentDto);
    }
}