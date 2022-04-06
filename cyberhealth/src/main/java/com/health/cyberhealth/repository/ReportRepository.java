package com.health.cyberhealth.repository;

import com.health.cyberhealth.model.ReportModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends CrudRepository<ReportModel, Long> {
    
}
