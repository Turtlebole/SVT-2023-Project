package com.example.baraotome.service.implementation;

import com.example.baraotome.model.entity.GroupAdmin;
import com.example.baraotome.repository.AdminRepository;
import com.example.baraotome.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public void save(GroupAdmin groupAdmin){
        adminRepository.save(groupAdmin);
    }
}
