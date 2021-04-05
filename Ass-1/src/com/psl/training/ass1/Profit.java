package com.psl.training.ass1;

public class Profit {
	static float calculateProfit( int numAttendees) {
		return (numAttendees*(5-0.5f) - 20);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateProfit(20));
	}

}
