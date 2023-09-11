package com.example.baraotome.repository;

import com.example.baraotome.model.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public interface GroupRepository extends JpaRepository<Group, Integer> {
    List<Group> findByName(String name);

}
