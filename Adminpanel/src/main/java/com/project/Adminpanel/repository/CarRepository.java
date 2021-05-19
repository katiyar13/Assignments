package com.project.Adminpanel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.Adminpanel.model.CarDetails;

public interface CarRepository extends MongoRepository<CarDetails,Integer> {

}
