package com.project.Adminpanel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CarDetails")
public class CarDetails { 
	@Id
	int customerid;
	String Customername;
	String carname;
	String cartype;
	String address;
	
	public CarDetails(int customerid, String customername, String carname, String cartype, String address) {
		super();
		this.customerid = customerid;
		Customername = customername;
		this.carname = carname;
		this.cartype = cartype;
		this.address = address;
	}

	public CarDetails() { super(); }
	
	public String getCarname() {
		return carname;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return ( customerid+" "+Customername+" "+carname + " "+ cartype +
				" " + address);
		
	}
	
}
