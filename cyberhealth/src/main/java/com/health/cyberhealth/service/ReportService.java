package com.health.cyberhealth.service;

import com.health.cyberhealth.model.ReportModel;
import com.health.cyberhealth.repository.ReportRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public void saveReport(ReportModel reportModel) {

        reportRepository.save(reportModel);
    }

    public ReportModel fetchReport(Long id) {

        return reportRepository.findById(id).orElse(null);
    }

    
    
}
