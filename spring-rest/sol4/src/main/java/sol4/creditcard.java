package sol4;

public class creditcard {
String cardtype;
String carddigit;

protected creditcard(String cardtype, String carddigit) {
	super();
	this.cardtype = cardtype;
	this.carddigit = carddigit;
}
public String getCarddigit() {
	return carddigit;
}
public void setCarddigit(String carddigit) {
	this.carddigit = carddigit;
}
public String getCardtype() {
	return cardtype;
}
public void setCardtype(String cardtype) {
	this.cardtype = cardtype;
}

}
