package com.health.cyberhealth.repository;

import com.health.cyberhealth.model.PrescriptionModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends CrudRepository<PrescriptionModel, Long> {
    
}
