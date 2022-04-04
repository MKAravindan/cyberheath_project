package com.health.cyberhealth.service;


import com.health.cyberhealth.model.BookingModel;
import com.health.cyberhealth.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    
    @Autowired
    private BookingRepository bookingRepository;

    public void saveBooking(BookingModel bookingModel) {

        bookingRepository.save(bookingModel);
    }

    public void deleteBookingById(Long id) {

        bookingRepository.deleteById(id);
    }

}
