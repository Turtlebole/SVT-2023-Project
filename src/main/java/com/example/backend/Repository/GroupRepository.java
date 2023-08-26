package com.example.backend.Repository;

import com.example.backend.Models.Group;
import com.example.backend.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
public interface GroupRepository extends JpaRepository<Group, Integer> {
    List<Group> findAllGroups();
    Optional<Group> findGroupByDesc(String description);

}
