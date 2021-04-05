package com.psl.training.ass3.medicine;

public class Medicine {
	private String companyName, address;
	
	public void setCompanyName(String name) {
		this.companyName = name;
	}
	
	public void setAddress(String addrs) {
		this.address = addrs;
	}
	
	public void displayLabel() {
		System.out.println("Company\t: " + this.companyName);
		System.out.println("Address\t: " + this.address);
	}

}
