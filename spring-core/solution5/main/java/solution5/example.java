package solution5;

import javax.inject.Inject;

public class example {
private String name;
private int number, age;
private String city,state,country;
public example(String name, int number, int age, String city, String state, String country) {
	super();
	this.name = name;
	this.number = number;
	this.age = age;
	this.city = city;
	this.state = state;
	this.country = country;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public void show() {
	System.out.println("Details:");
	System.out.println (name+" "+number+" "+age+" "+
       city+" "+state+" "+country);
}
}
