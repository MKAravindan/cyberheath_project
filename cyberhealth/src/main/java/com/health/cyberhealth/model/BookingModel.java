package com.health.cyberhealth.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "booking")
public class BookingModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String bookingId;

    @OneToOne()
    private UserModel patientDetail;

    @OneToOne()
    private DoctorModel doctorDetail;

    @Column(nullable = false)
    private String hospitalName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @Column(nullable = false)
    private String time;

    @Column(nullable = false)
    private boolean bookingStatus;

    public BookingModel() {
    }

    public BookingModel(Long id, String bookingId, UserModel patientDetail, DoctorModel doctorDetail,
            String hospitalName, Date date, String time, boolean bookingStatus) {
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

    public UserModel getPatientDetail() {
        return patientDetail;
    }

    public void setPatientDetail(UserModel patientDetail) {
        this.patientDetail = patientDetail;
    }

    public DoctorModel getDoctorDetail() {
        return doctorDetail;
    }

    public void setDoctorDetail(DoctorModel doctorDetail) {
        this.doctorDetail = doctorDetail;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
