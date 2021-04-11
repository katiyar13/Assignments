package solution1;

public class Customer {
String name;
int id,number;
Address address;

public Customer(String name, int id, int number, Address address) {
	super();
	this.name = name;
	this.id = id;
	this.number = number;
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String toString() {
	return (name+" "+id+" "+number+" "+
      address);
}
}
