package com.health.cyberhealth.service;

import com.health.cyberhealth.model.AdminModel;
import com.health.cyberhealth.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public AdminModel fetchUserByEmailAndPassword(String tempEmail, String tempPass) {

        return adminRepository.findByEmailAndPassword(tempEmail, tempPass);
        
    }

    
}
