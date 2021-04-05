package com.psl.training.ass1;

public class Interest {
	static double calInterest(int amt) {
		float rate=0;
		if (amt<=1000) {
			rate = 4;
		}else if(amt<=5000) {
			rate = 4.5f;
		}else {
			rate = 5;
		}
		return (amt*rate/100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calInterest(10000));
	}

}
