package com.maersk.controller;

import com.maersk.model.Booking;
import com.maersk.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/bookings")
public class BookingController {
    @Autowired
    private BookingService service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/createBooking")
    public Booking createBooking(@RequestBody Booking booking){
        return service.saveBooking(booking);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/checkAvailable")
    public Booking checkAvailability(@RequestBody Booking booking){
        return service.saveBooking(booking);
    }
    @GetMapping
    public List<Booking> getAllBookings(){
        return service.getAllBookings();
    }

    @GetMapping("/{bookingId}")
    public Booking getBooking(@PathVariable String bookingId){
        return service.getBookingByBookingId(bookingId);
    }

}
