package com.health.cyberhealth.service;

import com.health.cyberhealth.model.DoctorModel;
import com.health.cyberhealth.repository.DoctorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public DoctorModel fetchDoctorByEmailAndPassword(String tempEmail, String tempPass) {

        return doctorRepository.findByEmailAndPassword(tempEmail, tempPass);
    }

}
