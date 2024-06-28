package com.server.movie_app_VMO.controller;

import com.server.movie_app_VMO.entity.Comment;
import com.server.movie_app_VMO.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/movie/{movieId}")
    public List<Comment> getCommentsByMovieId(@PathVariable Long movieId) {
        return commentService.getCommentsByMovieId(movieId);
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
    }
}