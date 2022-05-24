package com.orange.SocialSharing.Controller;


import com.orange.SocialSharing.Service.PostService;
import com.orange.SocialSharing.models.Post;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private PostService postService;

    @GetMapping(value = "/posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @PostMapping(value = "/posts/newPost")
    public void addPost(@RequestBody Post post){

    }

    @DeleteMapping(value = "/posts/delete/{id}")
    public void deletePost(@PathVariable int id){

    }

    @PutMapping(value = "/posts")
    public void updatePost(@RequestBody Post post){

    }
}
