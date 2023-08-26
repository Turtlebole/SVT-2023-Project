package com.example.backend.Repository;

import com.example.backend.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public interface UserRepository extends JpaRepository<User, Integer> {
    public List<User> findAllUsers();
    public Optional<User> findById(int id);
    public List<User> findByEmail(String email);
}
