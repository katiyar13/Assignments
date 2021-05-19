package com.project.Customerpanel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.Customerpanel.model.carDetail;

public interface CarRepository extends MongoRepository<carDetail,Integer> {

}
