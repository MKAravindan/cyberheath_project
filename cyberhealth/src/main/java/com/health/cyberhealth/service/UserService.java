package com.health.cyberhealth.service;

import com.health.cyberhealth.model.UserModel;
import com.health.cyberhealth.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel fetchUserByEmail(String email) {

        return userRepository.findByEmail(email);

    }

    public void saveUser(UserModel userDetails) {

        userRepository.save(userDetails);
    }

    public UserModel fetchUserByEmailAndPassword(String email, String password) {

        return userRepository.findByEmailAndPassword(email, password);
        
    }
    
}
