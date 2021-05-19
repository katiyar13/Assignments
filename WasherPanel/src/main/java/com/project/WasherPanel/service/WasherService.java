package com.project.WasherPanel.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.WasherPanel.model.AuthenticationRequest;
import com.project.WasherPanel.repository.AuthenticateRepository;
@Service
public class WasherService implements UserDetailsService{

	@Autowired AuthenticateRepository authenticaterepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AuthenticationRequest washer = authenticaterepo.findByUsername(username);
		if(washer==null) {
			throw new UsernameNotFoundException("Washer Not Found with username: " + username);
		}
		else {
			washer.username=washer.getUsername();
			washer.password=washer.getPassword();
		}
		return new User(washer.username,washer.password,new ArrayList<>());
	}
	

}
