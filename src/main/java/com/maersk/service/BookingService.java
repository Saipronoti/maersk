package com.maersk.service;

import com.maersk.dto.BookingRequest;
import com.maersk.model.Booking;
import com.maersk.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookingService {
    @Autowired
    private BookingRepository repository;

    public Booking saveBooking(BookingRequest bookingRequest){ // this is object got from client calling api, in this case its request from postman
        //Booking booking=Booking.build(null,bookingRequest.getContainerSize(),bookingRequest.getOrigin(),bookingRequest.getDestination(),bookingRequest.getQuantity());
        Booking booking=new Booking(null,bookingRequest.getContainerSize(),bookingRequest.getOrigin(),bookingRequest.getDestination(),bookingRequest.getQuantity());
        booking.setBookingId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(booking);
    }

    public List<Booking> getAllBookings(){
        return repository.findAll();
    }

    public Booking getBookingByBookingId(String bookingId){
        return repository.findById(bookingId).get();
    }
}
