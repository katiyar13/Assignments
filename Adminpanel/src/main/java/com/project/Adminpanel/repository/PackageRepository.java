package com.project.Adminpanel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.Adminpanel.model.Packages;


public interface PackageRepository extends MongoRepository<Packages,String>{

	

}
