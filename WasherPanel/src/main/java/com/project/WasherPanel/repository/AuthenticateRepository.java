package com.project.WasherPanel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.WasherPanel.model.AuthenticationRequest;

public interface AuthenticateRepository extends MongoRepository<AuthenticationRequest,String>{
	AuthenticationRequest findByUsername(final String userName);


}
