package com.example.baraotome.service.implementation;

import com.example.baraotome.model.entity.Post;
import com.example.baraotome.repository.PostRepository;
import com.example.baraotome.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public Post findById(Integer postId) {
        Optional<Post> optionalPost = postRepository.findById(postId);
        return optionalPost.orElse(null);
    }

    @Override
    public List<Post> findPostsByGroup(Integer group) {
        List<Post> posts = new ArrayList<>();
        List<Post> allPosts = postRepository.findAll();
        for (Post post : allPosts) {
            if (post.getGroup().getId().equals(group)) {
                posts.add(post);
            }
        }
        return posts;
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }
    @Override
    public Post updatePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void delete(Integer post) { postRepository.deleteById(post);}

}
