package com.example.backend.Repository;

import com.example.backend.Models.Group;
import com.example.backend.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Integer> {
    List<Group> findAllGroups();
    Optional<Group> findGroupByDesc(String description);

}
