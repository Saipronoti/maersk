package com.maersk.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class BookingRequest {

    private String bookingId;
    Integer containerSize;
    enum containerType {
        DRY,
        REEFER
    }
    String origin;
    String destination;
    Integer quantity;

}
