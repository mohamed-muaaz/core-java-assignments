package com.psl.training.ass5.model;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date(String date) {
		String[] splitted = date.split("/");	
		this.year = Integer.parseInt(splitted[2]);
		this.month = Integer.parseInt(splitted[1]);
		this.day = Integer.parseInt(splitted[0]);	
	}
	
	public String getData() {
		return (year+"/"+month+"/"+day);
	}
	
	
}
