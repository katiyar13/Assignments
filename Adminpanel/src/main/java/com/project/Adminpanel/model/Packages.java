package com.project.Adminpanel.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Packages")
public class Packages {
	int price;
	String packagename;
	
	
	  public Packages() { super(); } public Packages(int price, String packagename) {
	  super(); this.price = price; this.packagename = packagename; }
	 
	 
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPackagename() {
		return packagename;
	}
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	public String toString() {
		return (price + " "+ packagename);
	}
}
