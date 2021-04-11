package sol4;

public class validate {
	String cd;
	long digit;
public String validation(creditcard cc) {
	if(cc.getCardtype().equalsIgnoreCase("American Express")||cc.getCardtype().equalsIgnoreCase("Visa")||cc.getCardtype().equalsIgnoreCase("Discover")) {
		if(cc.getCarddigit().length()==16) {
			 cd=cc.getCarddigit().substring(0,6);
			 digit=Long.parseLong(cd);
			if(digit>=601100 && digit<=601109 || digit>=601120 && digit<=601149 || digit==601174 || digit>=601177 && digit<=601179 || digit>=601186 && digit<=601199 ||digit>=644000 && digit<=650000)
				return "Valid card";
			else
				return "Invalid card";
	}
		else
			return "Invalid card";
		}
	else if(cc.getCardtype().equalsIgnoreCase("enRoute")) {
		if(cc.getCarddigit().length()==15) {
			cd=cc.getCarddigit().substring(0,4);
			if(cd.equalsIgnoreCase("2014")|| cd.equalsIgnoreCase("2149"))
				return "valid card";
			else
				return "invalid card";
		}
		else
			return "invalid card";
	}
	else if(cc.getCardtype().equalsIgnoreCase("JCB")) {
		if(cc.getCarddigit().length()>=16 || cc.getCarddigit().length()<=19) {
			cd=cc.getCarddigit().substring(0,4);
			if(cd.equalsIgnoreCase("3528")||cd.equalsIgnoreCase("3589"))
				return "valid card";
			else
				return "invalid card";
		}
		else
			return "invalid card";
	}
	else if(cc.getCardtype().equalsIgnoreCase("MasterCard")) {
		if(cc.getCarddigit().length()==16) {
			cd=cc.getCarddigit().substring(0,6);
			if(digit>=510000 && digit<=559999 || digit>=222100 && digit<=272099)
				return "valid card";
			else
				return "invalid card";
		}
		else
			return "invalid card";
	}
	else
		return "invalid card";
}
}
