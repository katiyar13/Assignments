package com.project.Customerpanel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.Customerpanel.model.Packages;

public interface PackageRepository extends MongoRepository<Packages,String>{

	

}
