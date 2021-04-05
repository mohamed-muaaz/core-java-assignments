package com.psl.training.ass1;

public class Tax {
	static double calTax(int gp) {
		float rate=0;
		if (gp<=240) {
			rate = 0;
		}else if(gp<=480) {
			rate = 15;
		}else {
			rate = 28;
		}
		return (gp*rate/100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calTax(500));
	}

}
