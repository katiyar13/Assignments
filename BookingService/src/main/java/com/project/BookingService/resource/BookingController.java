package com.project.BookingService.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.BookingService.models.Booking;
import com.project.BookingService.repository.BookingRepository;


@RestController
@RequestMapping("/booking")
public class BookingController {
	
	 @Autowired private BookingRepository bookrepo;
	 
	 @PostMapping("/bookwash") 
	  public String sheduling(@RequestBody Booking shedule ) { 
		 if(shedule.getBookingid()==0||shedule.getPackagename()==null||shedule.getDate()==null||
				 shedule.getTime()==null) {
			 return("Detail incomplete.");}
		 else{
			 bookrepo.save(shedule);
	    return ("Added booking with id:"+shedule.getBookingid()); }
	 }
	 @GetMapping("/showbookingdetail/{bookingid}")
	public String findbookingdetail(@PathVariable int bookingid) {
		return bookrepo.findById(bookingid).toString();  
	 }
	@GetMapping("/showallbookings")
	public List<Booking> findallbooking(){
		return	(bookrepo.findAll());
	}
	@DeleteMapping("/deletewash/{id}")
	public String deleting(@PathVariable int id) {
		if(bookrepo.findById(id).isPresent()) {
			bookrepo.deleteById(id);
			return ("Deleted Id:"+id);
		}
		else {
			return "Not available";
		}
}
}
