package com.maersk.test;

import com.maersk.dto.BookingRequest;
import com.maersk.model.Booking;
import com.maersk.repository.BookingRepository;
import com.maersk.service.BookingService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class BookingServiceTest {

    @Autowired
    private BookingService service;

    @MockBean
    private BookingRepository repository;
    @Test
    public void saveBookingTest(){
        BookingRequest bookingRequest=new BookingRequest("123456",5,"Mumbai","Pune",50);
        Booking booking=new Booking(null,bookingRequest.getContainerSize(),bookingRequest.getOrigin(),bookingRequest.getDestination(),bookingRequest.getQuantity());
        when(repository.save(booking)).thenReturn(booking);
        assertEquals(booking,service.saveBooking(bookingRequest));
    }
}
