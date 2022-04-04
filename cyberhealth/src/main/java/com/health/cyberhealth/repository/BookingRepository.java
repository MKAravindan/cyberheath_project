package com.health.cyberhealth.repository;

import com.health.cyberhealth.model.BookingModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<BookingModel, Long> {
    
}
