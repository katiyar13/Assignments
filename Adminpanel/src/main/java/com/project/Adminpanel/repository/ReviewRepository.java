package com.project.Adminpanel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.Adminpanel.model.Review;

public interface ReviewRepository extends MongoRepository<Review,String>{

}
