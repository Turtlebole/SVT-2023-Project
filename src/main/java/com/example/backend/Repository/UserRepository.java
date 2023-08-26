package com.example.backend.Repository;

import com.example.backend.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public interface UserRepository extends JpaRepository<User, Integer> {
     List<User> findAllUsers();
     Optional<User> findById(int id);
     Optional<User> findByEmail(String email);
}
