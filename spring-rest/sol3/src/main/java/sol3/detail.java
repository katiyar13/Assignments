package sol3;


public class detail {
String state,city,country;

public detail(String state, String city, String country) {
	super();
	this.state = state;
	this.city = city;
	this.country = country;
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
public String toString() {
	return (city+" "+state+" "+country);
}

}
