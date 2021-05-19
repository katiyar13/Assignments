package com.project.BookingService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.BookingService.models.Booking;


public interface BookingRepository extends MongoRepository<Booking,Integer> {

}
