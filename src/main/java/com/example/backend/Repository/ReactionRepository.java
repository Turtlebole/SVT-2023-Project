package com.example.backend.Repository;

import com.example.backend.Models.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ReactionRepository extends JpaRepository<Reaction, Integer> {
}
