package com.project.Customerpanel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.project.Customerpanel.model.AuthenticationRequest;
import com.project.Customerpanel.model.AuthenticationResponse;
import com.project.Customerpanel.model.Review;
import com.project.Customerpanel.model.carDetail;
import com.project.Customerpanel.resource.Controller;

@SpringBootTest
class CustomerpanelApplicationTests {
	
	  @Autowired private Controller control;

	@Test
	void logintest(){
		AuthenticationRequest login= new AuthenticationRequest("ram",null);
		String actual=control.input(login);
		String expected="Data insufficient.";
		assertEquals(actual,expected);
		
		AuthenticationRequest login1= new AuthenticationRequest(null,"ram");
		String actual1=control.input(login1);
		String expected1="Data insufficient.";
		assertEquals(actual1,expected1);
		
		AuthenticationRequest login2= new AuthenticationRequest("ram","ram");
		String actual2=control.input(login2);
		String expected2="Login Detail added";
		assertEquals(actual2,expected2);}
	@Test
	void adddetailtest(){
		carDetail cardetail=new carDetail(67,"bhumi","RangeRover","suv","23 gopal street");
		String actual=control.addingdetail(cardetail);
		String expected=cardetail.toString();
		assertEquals(actual,expected);
		
		carDetail cardetail1=new carDetail(67,null,"RangeRover","suv","23 gopal street");
		String actual1=control.addingdetail(cardetail1);
		String expected1="Fields cannot be null";
		assertEquals(actual1,expected1);
		
		carDetail cardetail2=new carDetail(67,"bhumi","RangeRover",null,"23 gopal street");
		String actual2=control.addingdetail(cardetail2);
		String expected2="Fields cannot be null";
		assertEquals(actual2,expected2);}
	@Test
	void writereviewtest() {
		Review review=new Review("ram","Amazing work",5);
		String actual=control.writereview(review);
		String expected=review.toString();
		assertEquals(actual,expected);
		
		Review review1=new Review("ram",null,5);
		String actual1=control.writereview(review1);
		String expected1="Input is not correct";
		assertEquals(actual1,expected1);
		
		Review review2=new Review("ram","Amazing work",6);
		String actual2=control.writereview(review2);
		String expected2="Input is not correct";
		assertEquals(actual2,expected2);}

}
