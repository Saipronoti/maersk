package com.maersk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="bookings")
public class Booking {

    @Id
    private String bookingId;
    int containerSize;
    enum containerType{

    }
    String origin;
    String destination;
    String quantity;
}
