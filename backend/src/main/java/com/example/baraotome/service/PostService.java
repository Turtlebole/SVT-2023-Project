package com.example.baraotome.service;

import com.example.baraotome.model.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> findPostsByGroup(Integer group);
    List<Post> getAllPosts();
    Post findById(Integer post);
    Post createPost(Post post);
    Post updatePost(Post updatedPost);
    void delete(Integer post);
}
