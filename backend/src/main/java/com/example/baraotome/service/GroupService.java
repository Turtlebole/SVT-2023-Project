package com.example.baraotome.service;

import com.example.baraotome.model.entity.Group;
import com.example.baraotome.model.entity.User;

import java.util.List;

public interface GroupService {

    List<Group> getAllGroups();
    List<Group> findByName(String name);
    Group findById(Integer group);
    Group findGroupById(Integer group);
    Group createGroup(Group group);
    Group updateGroup(Integer group, Group updated);
    void save(Group group);
    void delete(Integer group);
}
