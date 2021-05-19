package com.project.Customerpanel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.Customerpanel.model.AuthenticationRequest;

public interface AuthenticateRepository extends MongoRepository<AuthenticationRequest,String>{
	AuthenticationRequest findByUsername(final String userName);


}
