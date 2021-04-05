package com.psl.training.ass1;

public class Prime {
	static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		int factorCnt = 0;
		for(int i=1; i<=Math.sqrt(num); i++) {
			if(num%i == 0) {
				factorCnt += 1;
			}
			if (factorCnt>1) {
				return false;
			}
		}
		return true;
	}
	
	static void printPrime(int maxVal) {
		for(int i=1; i<=maxVal; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrimeNumber(1));
		printPrime(100);
	}

}
