package com.project.PaymentService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.PaymentService.models.payment;

public interface PaymentRepository extends MongoRepository<payment,Integer>{

}
