package com.example.baraotome.repository;

import com.example.baraotome.model.entity.GroupAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<GroupAdmin, Integer> {
    GroupAdmin save(GroupAdmin groupAdmin);
}
