package com.jareer.docker_compose.controller;

import com.jareer.docker_compose.model.Post;
import com.jareer.docker_compose.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private final PostService postService;

    @GetMapping
    public List<Post> findAll() {
        return postService.findAll();
    }


}
