package com.project.WasherPanel.model;

public class AuthenticationResponse {
	public String jwt;
	

	public String getJwt() {
		return jwt;
	}

	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	public AuthenticationResponse() {
		super();
	}
	

	

}
