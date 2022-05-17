package com.orange.SocialSharing.post;

import com.orange.SocialSharing.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;


    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }


    public void addPost(Post post){
        postRepository.save(post);
    }

    public void deletePost(String id){
        //Post post = postRepository.findAllById(id);
        //postRepository.delete(post);
    }


    public void updatePost(Post post){

    }
}
