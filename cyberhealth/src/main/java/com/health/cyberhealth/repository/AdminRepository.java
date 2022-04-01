package com.health.cyberhealth.repository;

import com.health.cyberhealth.model.AdminModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<AdminModel, Long> {

    AdminModel findByEmailAndPassword(String tempEmail, String tempPass);
    
}
