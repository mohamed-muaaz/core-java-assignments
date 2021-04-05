package com.psl.training.ass1;

public class ElectricityBill {
	static double calBill(int units, String connType) {
		float[] rate1 = {4,4.5f,4.75f,5};
		float[] rate2 = {4.25f,4.75f,5,5.25f};
		float[] rates = {0,0,0,0};
		double bill; 
		
		if (connType.equals("domestic")) {
			rates = rate1;
		}
		else if (connType.equals("commercial")) {
			rates = rate2;
		}
		
		if (units<=100 && connType.equals("domestic")) {
			bill = Math.max(units*rates[0], 250);
		}else if (units<=100 && connType.equals("commercial")) {
			bill = Math.max(units*rates[0], 350);
		}else if(units<=300) {
			bill = units*rates[1];
		}else if(units<=500) {
			bill = units*rates[2];
		}else {
			bill = units*rates[3];
		}
		return bill;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calBill(1000,"commercial"));
	}
}
