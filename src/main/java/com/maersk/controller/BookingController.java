package com.maersk.controller;

import com.maersk.dto.BookingRequest;
import com.maersk.model.Booking;
import com.maersk.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
   public ResponseEntity<Booking> createBooking(@RequestBody @Valid BookingRequest bookingRequest){
        return new ResponseEntity<>(service.saveBooking(bookingRequest),HttpStatus.CREATED);
    }

   /* @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/checkAvailable")
    public Booking checkAvailability(@RequestBody Booking booking){
        return service.saveBooking(booking);
    }*/
    @GetMapping("/fetchBookings")
    public ResponseEntity<List<Booking>> getAllBookings(){
        return ResponseEntity.ok(service.getAllBookings());
    }

    @GetMapping("/{bookingId}")
    public Booking getBooking(@PathVariable String bookingId){
        return service.getBookingByBookingId(bookingId);
    }

}
