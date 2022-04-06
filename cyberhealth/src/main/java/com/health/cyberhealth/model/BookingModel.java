package com.health.cyberhealth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class BookingModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String bookingId;

    @Column(nullable = false)
    private String patientDetail;

    @Column(nullable = false)
    private String doctorDetail;

    @Column(nullable = false)
    private String hospitalName;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String time;

    @Column(nullable = false)
    private boolean bookingStatus;

    public BookingModel() {
    }

    public BookingModel(Long id, String bookingId, String patientDetail, String doctorDetail,
            String hospitalName, String date, String time, boolean bookingStatus) {
        this.id = id;
        this.bookingId = bookingId;
        this.patientDetail = patientDetail;
        this.doctorDetail = doctorDetail;
        this.hospitalName = hospitalName;
        this.date = date;
        this.time = time;
        this.bookingStatus = bookingStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getPatientDetail() {
        return patientDetail;
    }

    public void setPatientDetail(String patientDetail) {
        this.patientDetail = patientDetail;
    }

    public String getDoctorDetail() {
        return doctorDetail;
    }

    public void setDoctorDetail(String doctorDetail) {
        this.doctorDetail = doctorDetail;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

}
