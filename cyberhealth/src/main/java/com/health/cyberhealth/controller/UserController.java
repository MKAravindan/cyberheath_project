package com.health.cyberhealth.controller;

import com.health.cyberhealth.model.AdminModel;
import com.health.cyberhealth.model.BookingModel;
import com.health.cyberhealth.model.DoctorModel;
import com.health.cyberhealth.model.UserModel;
import com.health.cyberhealth.service.AdminService;
import com.health.cyberhealth.service.BookingService;
import com.health.cyberhealth.service.DoctorService;
import com.health.cyberhealth.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private BookingService bookingService;

    @PostMapping("/signup")
    public String saveUser(@RequestBody UserModel userDetails) throws Exception {

        String tempEmail = userDetails.getEmail();
        UserModel userObj = userService.fetchUserByEmail(tempEmail);

        if(userObj != null) {
            throw new Exception("Email Already Exist");
        }

        userService.saveUser(userDetails);

        return "Successfully SignedUp";

    }

    @PostMapping("/login")
    public String login(@RequestBody UserModel userDetails) throws Exception {

        String tempEmail = userDetails.getEmail();
        String tempPass = userDetails.getPassword();

        UserModel userObj = userService.fetchUserByEmailAndPassword(tempEmail, tempPass);

        AdminModel adminObj = adminService.fetchUserByEmailAndPassword(tempEmail, tempPass);

        DoctorModel doctorObj = doctorService.fetchDoctorByEmailAndPassword(tempEmail, tempPass);

        if(userObj == null && adminObj == null && doctorObj == null){

            throw new Exception("User not found");

        }

        if(userObj != null) {

            return "User LoggedIn";

        } else if(adminObj != null) {

            return "Admin LoggedIn";

        } else if(doctorObj != null) {

            return "Doctor LoggedIn";
            
        }


        return "Successfully LoggedIn";
    }


    @GetMapping("/doctor")
    public Iterable<UserModel> getAllDoctors() {

        return doctorService.fetchAllDoctors();
    }


    @PostMapping("/booking")
    public String createBooking(@RequestBody BookingModel bookingModel) throws Exception {

            bookingService.saveBooking(bookingModel);
        return "Successfully Booked";
    }

    @DeleteMapping("/booking/{id}")
    public String deleteBooking(@PathVariable Long id) {

        bookingService.deleteBookingById(id);
        return "Booking Deleted";
    }

}
