package sol4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	validate vd;
	    @GetMapping(path = "/validateCard")
	    public creditcard checkCard()
	    {
	        creditcard creditCard = new creditcard("Visa" , "6011051010120011");
	        return vd.validation(creditCard).equalsIgnoreCase("Valid Credit Card") ? creditCard : creditCard;
	    }

}
