package com.project.BookingService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.booking_service.model.booking;
import com.project.booking_service.repository.BookingRepository;
import com.project.booking_service.resource.BookingController;

@SpringBootTest
class BookingServiceApplicationTests {
	@Autowired BookingController control;
	@Autowired BookingRepository bookrepo;

	@Test
	void bookwashtest() {
		booking book=new booking(5,"normal washing","2020-08-15","18:35","interior");
		String actual=control.sheduling(book);
		String expected="Added booking with id:"+book.getBookingid();
		assertEquals(actual,expected);
		
		booking book1=new booking(5,"normal washing",null,"18:35","interior");
		String actual1=control.sheduling(book1);
		String expected1="Detail incomplete.";
		assertEquals(actual1,expected1);
		
		booking book2=new booking(5,null,"2020-08-15","18:35","interior");
		String actual2=control.sheduling(book2);
		String expected2="Detail incomplete.";
		assertEquals(actual2,expected2);
	}
	@Test
	void deletewashtest() {
		int id=11;
		String actual=control.deleting(id);
		String expected="Deleted Id:"+id;
		assertEquals(actual,expected);
		
		int id2=13;
		String actual2=control.deleting(id2);
		String expected2="Not available";
		assertEquals(actual2,expected2);
		
		int id1=89;
		String actual1=control.deleting(id1);
		String expected1="Not available";
		assertEquals(actual1,expected1);
	}
	@Test
	void showallbooking() {
		List<booking> actual=control.findallbooking();
		List<booking> expected=bookrepo.findAll();
		assertEquals(actual,expected);
		}
	@Test
	void showbookingdetailtest() {
		int id=11;
		String actual=control.findbookingdetail(id);
		String expected=bookrepo.findById(id).toString();
		assertEquals(actual,expected);
		
		int id1=21;
		String actual1=control.findbookingdetail(id1);
		String expected1=bookrepo.findById(id1).toString();
		assertEquals(actual1,expected1);
	}

}
