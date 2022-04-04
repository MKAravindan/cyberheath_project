package com.health.cyberhealth.repository;

import com.health.cyberhealth.model.DoctorModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<DoctorModel, Long> {

    DoctorModel findByEmailAndPassword(String tempEmail, String tempPass);

    DoctorModel findByEmail(String tempEmail);
    
}
