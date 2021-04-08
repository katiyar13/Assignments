
public class trader {
String name;
String city;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public trader(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}
public String toString() {
	return "Trader:"+"\nname:"+name+"\nCity:"+city;
}
}
