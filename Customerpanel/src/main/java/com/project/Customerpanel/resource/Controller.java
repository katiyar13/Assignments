package com.project.Customerpanel.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.Customerpanel.model.AuthenticationRequest;
import com.project.Customerpanel.model.AuthenticationResponse;
import com.project.Customerpanel.model.Review;
import com.project.Customerpanel.model.booking;
import com.project.Customerpanel.model.carDetail;
import com.project.Customerpanel.model.payment;
import com.project.Customerpanel.model.Packages;
import com.project.Customerpanel.repository.AuthenticateRepository;
import com.project.Customerpanel.repository.CarRepository;
import com.project.Customerpanel.repository.PackageRepository;
import com.project.Customerpanel.repository.ReviewRepository;
import com.project.Customerpanel.service.UserService;
import com.project.Customerpanel.utility.JwtUtility;

@RestController
@RequestMapping("/user")
public class Controller {
	@Autowired	private CarRepository carrepo;       @Autowired private RestTemplate resttemplate;
	@Autowired private PackageRepository packrepo;   @Autowired	private ReviewRepository reviewrepo;
	@Autowired private AuthenticationManager authenticationManager;
	@Autowired private UserService userService;     @Autowired private JwtUtility jwtUtil;
	@Autowired private AuthenticateRepository authenticaterepo; 
	
	@PostMapping("/logindetail")
	public String input(@RequestBody AuthenticationRequest logindetail){
		if(logindetail.getUsername()==null||logindetail.getPassword()==null) {
			return("Data insufficient.");}
		else {authenticaterepo.save(logindetail);
			return "Login Detail added";
		}}
	
	  @PostMapping("/authenticate") public AuthenticationResponse createAuthenticationToken(@RequestBody AuthenticationRequest
	  authenticationRequest) throws Exception {
	  
	  try { authenticationManager.authenticate( new
	  UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),
	  authenticationRequest.getPassword()) ); } 
	  catch (BadCredentialsException e) {
	  throw new Exception("Incorrect username or password", e);} 
	  final UserDetails userDetails = userService.loadUserByUsername(authenticationRequest.getUsername());
	  
	  final String jwt = jwtUtil.generateToken(userDetails);
	  return new AuthenticationResponse(jwt); }
	 
	  @PostMapping("/adddetail") 
	  public String addingdetail(@RequestBody carDetail cardetail ) { 
		if(cardetail.getCustomername()==null||cardetail.getCartype()==null||
				cardetail.getCarname()==null||cardetail.getAddress()==null)
			return("Fields cannot be null");
		else {carrepo.save(cardetail);
			return (cardetail.toString());
		 }}
		
		  @GetMapping("/showpackages") public List<Packages> packagelist(){ 
			  return packrepo.findAll(); }
		  
		  @PostMapping("/bookingwash")
		  public String bookingwash(@RequestBody booking book) {
			String wash=resttemplate.postForObject("http://bookingapplication/booking/bookwash",book, String.class);
			//Optional<carDetail> detail=carrepo.findById(book.getBookingid());
			//rabbitmqSender.send(detail);
			return wash;
		  }
		  
		  @PostMapping("/doingpayment")
		  public String paying(@RequestBody payment pay) {
			  String value= resttemplate.postForObject("http://paymentapplication/payment/dopayment",pay, String.class);
			  return value;
		  }
		  @GetMapping("/showcardetail/{customerid}")
		  public Optional<carDetail> cardetail(@PathVariable int id){
			  return carrepo.findById(id);
		  }
		  
		@GetMapping("/showuserdetail/{id}")
		  public String display(@PathVariable int id) { 
			String details=resttemplate.getForObject("http://Customerpanel/user/showcardetail/{id}", String.class,id);
			String book=resttemplate.getForObject("http://bookingapplication/booking/showbookingdetail/{bookingid}", String.class,id);
			payment pay=resttemplate.getForObject("http://paymentapplication/payment/showpaydetail/{paymentid}", payment.class,id);
			return (details+"\nBookingDetail:"+book+"\nPaymentDetail:"+pay);  
				 }			  
		
	 @PostMapping("/writereview") 
	  public String writereview(@RequestBody Review review ) {
		 if(review.getRating()>5||review.getContent()==null||review.getName()==null) {
			 return("Input is not correct");}
		 else {
			 reviewrepo.save(review);
			 return (review.toString());}
	 }
}