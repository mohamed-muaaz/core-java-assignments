package com.psl.training.ass3.book;

public class Book {
	private String title;
	private double price;
	private String auther;
	private String publication;
	
	// Setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}

	// Getters
	public String getTitle() {
		return this.title;
	}
	public double getPrice() {
		return this.price;
	}
	public String getAuther() {
		return this.auther;
	}
	public String getPublication() {
		return this.publication;
	}
}
