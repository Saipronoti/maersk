package com.maersk.repository;

import com.maersk.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking,String> { //string is data type of primary key
}
