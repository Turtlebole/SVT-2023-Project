package com.example.backend.Repository;

import com.example.backend.Models.Comment;
import com.example.backend.Models.Post;
import com.example.backend.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;
@RestController
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
     List<Post> findAllPosts();
     Optional<Post> findPostById(int id);
     Optional<Post> findPostByContent(String content);
     @Query(value = "select p from Post p where p.user.id = :user")
     Set<Comment> findUserPost(@Param("user") Integer user);
}
