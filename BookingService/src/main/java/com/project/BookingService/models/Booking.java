package com.project.BookingService.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Booking")
public class Booking {
	@Id
	public int bookingid;
	public String packagename;
	public String date;
	public String time;
	public String addons;
	
	public Booking() {
		super();
	} 
	
	public Booking(int bookingid, String packagename, String date, String time, String addons) {
		super();
		this.bookingid = bookingid;
		this.packagename = packagename;
		this.date = date;
		this.time = time;
		this.addons = addons;
	}

	public String getAddons() {
		return addons;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getPackagename() {
		return packagename;
	}
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	public void setAddons(String addons) {
		this.addons = addons;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String toString() {
		return (bookingid+" "+packagename + " " +
	         date + " "+ time+" "+addons);
	}
	
}
