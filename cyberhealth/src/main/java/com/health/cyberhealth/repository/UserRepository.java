package com.health.cyberhealth.repository;

import com.health.cyberhealth.model.UserModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
    
    public UserModel findByEmail(String email);

    public UserModel findByEmailAndPassword(String email, String password);

}
