package com.health.cyberhealth.controller;

import com.health.cyberhealth.model.DoctorModel;
import com.health.cyberhealth.service.DoctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {


    @Autowired
    private DoctorService doctorService;

    @PostMapping("/admin/addDoctor")
    public String addDoctor(@RequestBody DoctorModel doctorDetails) throws Exception {
        
        String tempEmail = doctorDetails.getEmail();
        DoctorModel doctorObj = doctorService.fetchDoctorByEmail(tempEmail);

        if(doctorObj != null) {

            throw new Exception("Doctor already Exist");
        }

        doctorService.saveDoctor(doctorDetails);

        return "Doctor Added";
    }
    
}
