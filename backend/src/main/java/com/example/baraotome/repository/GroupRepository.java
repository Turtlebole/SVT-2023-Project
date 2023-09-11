package com.example.baraotome.repository;

import com.example.baraotome.model.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Integer> {
    List<Group> findByName(String name);

}
