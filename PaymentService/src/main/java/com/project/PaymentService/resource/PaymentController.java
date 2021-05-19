package com.project.PaymentService.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.PaymentService.models.payment;
import com.project.PaymentService.repository.PaymentRepository;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired private PaymentRepository payrepo;
	
	@PostMapping("/dopayment") public String paying(@RequestBody payment pay ){
			if(pay.getPaymentid()==0||pay.getBankname()==null||pay.getCardexpiry()==null||pay.getCardtype()==null) {
				return("Payment Details incomplete.");		}
			else {
				payrepo.save(pay);
				return("Payment Successful.\nId:"+pay.getPaymentid());}
	}
	
	@GetMapping("/showpaydetail/{paymentid}")
	public String showpaydetail(@PathVariable int paymentid) {
		Optional <payment> payment=(payrepo.findById(paymentid));
		   return payment.toString();		
	}
	
	@GetMapping("/showallpayments")
	public List<payment> showallpayment(){
		return (payrepo.findAll());
	}

}
