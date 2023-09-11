package com.example.baraotome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.baraotome.model.entity.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findFirstByUsername(String username);
    User findByUsername(User groupAdmin);
}
