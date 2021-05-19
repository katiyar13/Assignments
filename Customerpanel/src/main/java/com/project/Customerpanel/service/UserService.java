package com.project.Customerpanel.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.Customerpanel.model.AuthenticationRequest;
import com.project.Customerpanel.repository.AuthenticateRepository;

@Service
public class UserService implements UserDetailsService{
	@Autowired private AuthenticateRepository authenticationrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AuthenticationRequest user = authenticationrepo.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("User Not Found with username: " + username);
		}
		else {
			user.username=user.getUsername();
			user.password=user.getPassword();
		}
		return new User(user.username,user.password,new ArrayList<>());
	}


}
