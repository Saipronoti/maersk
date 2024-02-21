package com.maersk.service;

import com.maersk.model.Booking;
import com.maersk.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookingService {
    @Autowired
    private BookingRepository repository;

    public Booking saveBooking(Booking booking){
        booking.setBookingId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(booking);
    }
}
