package com.maersk.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@Document(collection="bookings")
public class Booking {

    @Id
    private String bookingId;
    Integer containerSize;

    enum containerType {
        DRY,
        REEFER
    }

    String origin;
    String destination;
    Integer quantity;

    public Booking(String bookingId, Integer containerSize, String origin, String destination, Integer quantity) {
        this.bookingId = bookingId;
        this.containerSize = containerSize;
        this.origin = origin;
        this.destination = destination;
        this.quantity = quantity;
    }
}