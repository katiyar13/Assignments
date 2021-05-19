package com.project.Adminpanel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Payment")
public class Payment {
	@Id
	int paymentid;
	String bankname;
	long cardno;
	String cardtype;
	String cardexpiry;
	
     public Payment() { super(); }
     
     
	public Payment(int paymentid, String bankname, long cardno, String cardtype, String cardexpiry) {
		super();
		this.paymentid = paymentid;
		this.bankname = bankname;
		this.cardno = cardno;
		this.cardtype = cardtype;
		this.cardexpiry = cardexpiry;
	}


	public String getBankname() {
		return bankname;
	}
	public int getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public long getCardno() {
		return cardno;
	}
	public void setCardno(long cardno) {
		this.cardno = cardno;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getCardexpiry() {
		return cardexpiry;
	}
	public void setCardexpiry(String cardexpiry) {
		this.cardexpiry = cardexpiry;
	}
	
	public String toString() {
		return (paymentid+" "+bankname+ " "+ cardno + " "+ cardtype+ " "+
	            cardexpiry);
	}
}
