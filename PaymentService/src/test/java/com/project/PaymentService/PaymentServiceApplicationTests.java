package com.project.PaymentService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.PaymentService.models.payment;
import com.project.PaymentService.repository.PaymentRepository;
import com.project.PaymentService.resource.PaymentController;

@SpringBootTest
class PaymentServiceApplicationTests {
@Autowired private PaymentController control;
@Autowired private PaymentRepository payrepo;
	@Test
	void paymenttest() {
		payment pay=new payment(5,"Kotak",808764329, "credit","03/25");
		String actual=control.paying(pay);
		String expected="Payment Successful.\nId:"+pay.getPaymentid();
		assertEquals(actual,expected);
		
		payment pay1=new payment(5,"Kotak",808764329, "credit",null);
		String actual1=control.paying(pay1);
		String expected1="Payment Details incomplete.";
		assertEquals(actual1,expected1);
		
		payment pay2=new payment(5,null,808764329, "credit","03/25");
		String actual2=control.paying(pay2);
		String expected2="Payment Details incomplete.";
		assertEquals(actual2,expected2);
	}
	@Test
	void showallpaymenttest() {
		List<payment> actual=control.showallpayment();
		List<payment> expected=payrepo.findAll();
		assertEquals(actual,expected);
	}
}
