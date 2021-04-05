package com.psl.training.ass1;

public class MaxNumber {
	static int calMax(int x,int y,int z) {
		int maximum = x;
		if (y>maximum) {
			maximum=y;
		} 
		if(z>maximum) {
			maximum=z;
		}
		return maximum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calMax(1000,200,30));
	}

}
