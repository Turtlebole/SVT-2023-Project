package com.example.baraotome.repository;

import com.example.baraotome.model.entity.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface ReactionRepository extends JpaRepository<Reaction, Integer> {
    Optional<Reaction> findById(Integer post);
}
