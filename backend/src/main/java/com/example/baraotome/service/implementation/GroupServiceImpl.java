package com.example.baraotome.service.implementation;

import com.example.baraotome.model.entity.Group;
import com.example.baraotome.model.entity.User;
import com.example.baraotome.repository.GroupRepository;
import com.example.baraotome.repository.UserRepository;
import com.example.baraotome.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public Group findGroupById(Integer group) {
        return groupRepository.findById(group).orElse(null);
    }

    @Override
    public Group createGroup(Group group) {
        group.setCreationDate(LocalDateTime.now());
        Group createdGroup = groupRepository.save(group);
        return createdGroup;
    }

    @Override
    public Group updateGroup(Integer groupId, Group updatedGroup) {
        Optional<Group> optionalGroup = groupRepository.findById(groupId);
        if (optionalGroup.isPresent()) {
            Group group = optionalGroup.get();
            if (updatedGroup.getName() != null) {
                group.setName(updatedGroup.getName());
            }
            if (updatedGroup.getDescription() != null) {
                group.setDescription(updatedGroup.getDescription());
            }
            if (updatedGroup.getGroupAdmin() != null) {
                User groupAdmin = userRepository.findByUsername(updatedGroup.getGroupAdmin());
                group.setGroupAdmin(groupAdmin);
            }
            return groupRepository.save(group);
        }
        return null;
    }

    @Override
    public void save(Group group) {groupRepository.save(group);}

    @Override
    public void delete(Integer group) {
        groupRepository.deleteById(group);
    }

    @Override
    public List<Group> findByName(String name) {
        return groupRepository.findByName(name);
    }

    @Override
    public Group findById(Integer group) {
        return null;
    }
}
