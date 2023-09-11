package com.example.baraotome.repository;

import com.example.baraotome.model.entity.Group;
import com.example.baraotome.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findByGroup(Group group);
}
