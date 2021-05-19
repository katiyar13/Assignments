package com.project.Customerpanel.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Userlogindetail")
public class AuthenticationRequest {
	public String username;
	public String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AuthenticationRequest() {
		super();
	}
	public AuthenticationRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	

}
