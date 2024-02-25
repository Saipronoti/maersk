package com.maersk.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class BookingRequest {

    private String bookingId;
    Integer containerSize;

    public BookingRequest(String bookingId, Integer containerSize, String origin, String destination, Integer quantity) {
        this.bookingId = bookingId;
        this.containerSize = containerSize;
        this.origin = origin;
        this.destination = destination;
        this.quantity = quantity;
    }

    enum containerType {
        DRY,
        REEFER
    }

    @Size(min = 5, max = 20)
    String origin;

    @Size(min = 5, max = 20)
    String destination;

    @Min(value = 1)
    @Max(value = 100)
    Integer quantity;

}
