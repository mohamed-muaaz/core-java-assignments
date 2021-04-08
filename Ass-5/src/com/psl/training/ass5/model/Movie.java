package com.psl.training.ass5.model;

public class Movie {
	private String id;
	private String name;
	private String language;
	private Date date;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDate() {
		return date.getData();
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
