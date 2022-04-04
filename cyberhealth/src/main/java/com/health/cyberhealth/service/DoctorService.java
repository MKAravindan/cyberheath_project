package com.health.cyberhealth.service;

import com.health.cyberhealth.model.DoctorModel;
import com.health.cyberhealth.model.UserModel;
import com.health.cyberhealth.repository.DoctorRepository;
import com.health.cyberhealth.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private UserRepository userRepository;

    public DoctorModel fetchDoctorByEmailAndPassword(String tempEmail, String tempPass) {

        return doctorRepository.findByEmailAndPassword(tempEmail, tempPass);
    }

    public Iterable<UserModel> fetchAllDoctors() {

        return userRepository.findByUserRole("doctor");
    }

    public DoctorModel fetchDoctorByEmail(String tempEmail) {

        return doctorRepository.findByEmail(tempEmail);
    }

    public void saveDoctor(DoctorModel doctorDetails) {

        doctorRepository.save(doctorDetails);
    }

}
