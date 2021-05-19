package com.project.WasherPanel.resource;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.WasherPanel.model.AuthenticationRequest;
import com.project.WasherPanel.model.AuthenticationResponse;
import com.project.WasherPanel.repository.AuthenticateRepository;
import com.project.WasherPanel.service.WasherService;
import com.project.WasherPanel.utility.JwtUtility;

@RestController
@RequestMapping("/washer")
public class WasherController {
	@Autowired AuthenticateRepository authenticaterepo;
	@Autowired private AuthenticationManager authenticationManager;
	@Autowired private JwtUtility jwtUtility;
	@Autowired private WasherService washerservice;
	@Autowired private RestTemplate resttemplate;
		
	@PostMapping("/washerlogindetail")
	public String input(@RequestBody AuthenticationRequest logindetail) {
		if(logindetail.getUsername()==null||logindetail.getPassword()==null) {
			return("Data insufficient.");}
		else {authenticaterepo.save(logindetail);
			return "Login Detail added";
		}}
	
	@PostMapping("/authenticate")
	public AuthenticationResponse createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

		try {authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));}
		catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}
		final UserDetails userDetails = washerservice.loadUserByUsername(authenticationRequest.getUsername());
		final String jwt = jwtUtility.generateToken(userDetails);
		return new AuthenticationResponse(jwt);
	}
	
	@PostMapping("/addwasher/id")
	public String addingwasher(@PathVariable int id) {
		return ("washer added to Id:"+id);
	}
	
	  @PostMapping("/addwasher") public String addwasher() throws IOException{
	  String url="http://localhost:7070/washer/addwasher";  
	  ResponseEntity<String> response=null; 
	  try {response=resttemplate.exchange(url,HttpMethod.POST,getHeaders(),String.class);} 
	  catch(Exception e) {
	  System.out.println(e);} System.out.println(response.getBody()); 
	  return  response.getBody(); } 
	  private HttpEntity<?> getHeaders() throws IOException{
	  HttpHeaders header=new HttpHeaders(); 
	  header.set("Accept",MediaType.APPLICATION_JSON_VALUE); return new HttpEntity<>(header); }
	
}
