package com.example.baraotome.repository;

import com.example.baraotome.model.entity.Group;
import com.example.baraotome.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findByGroup(Group group);
}
