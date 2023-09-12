package com.example.baraotome.service.implementation;

import com.example.baraotome.model.entity.ERole;
import com.example.baraotome.model.entity.Group;
import com.example.baraotome.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.baraotome.model.dto.UserDTO;
import com.example.baraotome.model.entity.User;
import com.example.baraotome.repository.UserRepository;
import com.example.baraotome.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private GroupRepository groupRepository;

    /*
    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
    }
*/
    @Override
    public User findByUsername(String username) {
        Optional<User> user = userRepository.findFirstByUsername(username);
        if (!user.isEmpty()) {
            return user.get();
        }
        return null;
    }

    @Override
    public User findByAdmin(Integer user) {
        return null;
    }

    @Override
    public List<Group> findGroupsByAdmin(Integer user) {
        List<Group> groupsByAdmin = new ArrayList<>();
        List<Group> allGroups = groupRepository.findAll();
        for (Group group : allGroups) {
            if (group.getGroupAdmin().getId() == user) {
                groupsByAdmin.add(group);
            }
        }
        return groupsByAdmin;
    }

    @Override
    public User createUser(UserDTO userDTO) {

        Optional<User> user = userRepository.findFirstByUsername(userDTO.getUsername());

        if(user.isPresent()){
            return null;
        }

        User newUser = new User();
        newUser.setUsername(userDTO.getUsername());
        newUser.setPassword(userDTO.getPassword());
        newUser.setRole(ERole.USER);
        newUser.setEmail(userDTO.getEmail());
        newUser.setFirstName(userDTO.getFirstName());
        newUser.setLastName(userDTO.getLastName());
        newUser = userRepository.save(newUser);

        return newUser;
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(int id) {

    }
}
