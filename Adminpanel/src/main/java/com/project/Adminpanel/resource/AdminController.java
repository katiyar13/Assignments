package com.project.Adminpanel.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.Adminpanel.model.Booking;
import com.project.Adminpanel.model.CarDetails;
import com.project.Adminpanel.model.Packages;
import com.project.Adminpanel.model.Review;
import com.project.Adminpanel.repository.CarRepository;
import com.project.Adminpanel.repository.PackageRepository;
import com.project.Adminpanel.repository.ReviewRepository;


@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired RestTemplate resttemplate;
	@Autowired CarRepository carrepo;
	@Autowired PackageRepository packrepo;
	@Autowired ReviewRepository reviewrepo;

	@GetMapping("/viewratings")
	public List<Review> showreview(){
		List<Review> ratings=reviewrepo.findAll();
		return ratings;
	}
	@DeleteMapping("/deleterating/{name}")
	public String deleterating(@PathVariable String name) {
		if(reviewrepo.existsById(name)) {
			reviewrepo.deleteById(name);
			return "Deleted Review "+name;
		}
		else {
			return ("Review not exist for Name"+name);}
	}
	
	@PostMapping("/addpackage")
	public String addingpackage(@RequestBody Packages pack) {
		if(pack.getPrice()==0||pack.getPackagename()==null) {
			return "Details cannot be empty";
		}
		else {
			packrepo.save(pack);
			return pack.toString();
		}
	}
	@DeleteMapping("/deletepackage/{packagename}")
	public String deletepackage(@PathVariable String packagename) {
		if(packrepo.existsById(packagename)) {
			packrepo.deleteById(packagename);
			return "Deleted"+packagename;
		}
		else {
			return "Package Not Available"+packagename;
		}
}
	
	@GetMapping("/showuserdetail/{id}")
	  public String display(@PathVariable int id) { 
		Optional<CarDetails> details=carrepo.findById(id);
		Booking book=resttemplate.getForObject("http://bookingapplication/booking/showbookingdetail/{bookingid}", Booking.class,id);
		Payment pay=resttemplate.getForObject("http://paymentapplication/payment/showpaydetail/{paymentid}", Payment.class,id);
		return (details+"\nBookingDetail:"+book+"\nPaymentDetail:"+pay);  
			 }	
	}
