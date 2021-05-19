package com.project.Adminpanel.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Review")
public class Review {
	String name;
	String content;
	int rating;
	
	
	public Review() {
		super();
	}
	public Review(String name, String content, int rating) {
		super();
		this.name = name;
		this.content = content;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String toString() {
		return (name + " " + content
				+ " " +rating);
		
	}
	
}
