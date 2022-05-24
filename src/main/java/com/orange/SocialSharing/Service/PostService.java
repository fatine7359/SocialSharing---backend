package com.orange.SocialSharing.Service;

import com.orange.SocialSharing.models.Post;
import com.orange.SocialSharing.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
