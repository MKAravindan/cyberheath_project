package com.health.cyberhealth.service;

import com.health.cyberhealth.model.PrescriptionModel;
import com.health.cyberhealth.repository.PrescriptionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    public void savePrescription(PrescriptionModel prescriptionModel) {

        prescriptionRepository.save(prescriptionModel);
    }

    public PrescriptionModel fetchAllPrescription(Long id) {

        return prescriptionRepository.findById(id).orElse(null);
    }

    

}
