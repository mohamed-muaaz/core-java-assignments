package com.psl.training.ass1;

public class PayBack {
	static float calPayBack(int amount) {
		float rate1 = 0.25f/100;
		float rate2 = 0.5f/100;
		float rate3 = 0.75f/100;
		float rate4 = 1.0f/100;
		
		float payBack;
		
		if(amount>=2500) {
			payBack = 500*rate1 + 1000*rate2 + 1000*rate3 + (amount-2500)*rate4;
		}else if(amount>=1500) {
			payBack = 500*rate1 + 1000*rate2 + (amount-1500)*rate3;
		}else if(amount>=500) {
			payBack = 500*rate1 + (amount-500)*rate2;
		}else {
			payBack = amount*rate1;
		}
		return payBack;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calPayBack(1400));
	}

}
