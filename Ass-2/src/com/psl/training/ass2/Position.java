package com.psl.training.ass2;

public class Position {
	static int findPosition(int num, int[] numbers) {
		for(int i=0; i<numbers.length; i++) {
			if (numbers[i]==num) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {50,21,42,10,54,36,85};
		System.out.println(findPosition(85, numbers));
	}

}
