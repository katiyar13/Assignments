package com.project.Customerpanel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.Customerpanel.model.Review;

public interface ReviewRepository extends MongoRepository<Review,String>{

}
