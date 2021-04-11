package solution1;

public class Address {
String street, state,city,country;
int zip;
public String toString() {
	return (street+" "+city+" "+state+" "+zip+" "+country);
	
}

public Address(String street, String state, String city, String country, int zip) {
	super();
	this.street = street;
	this.state = state;
	this.city = city;
	this.country = country;
	this.zip = zip;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
}
