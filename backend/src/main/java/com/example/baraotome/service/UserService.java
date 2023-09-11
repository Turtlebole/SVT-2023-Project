package com.example.baraotome.service;

import com.example.baraotome.model.dto.UserDTO;
import com.example.baraotome.model.entity.User;

import java.util.List;

public interface UserService {

    User findByUsername(String username);

    User createUser(UserDTO userDTO);

    List<User> findAll();
}
