package com.psl.training.ass2;

import java.util.*;

public class Prime {
	static boolean isPrime(int num) {
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
	
	static ArrayList<Integer> findPrime(int low, int high) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i=low; i<=high; i++) {
			if(isPrime(i)) {
				result.add(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPrime(20, 50));
	}

}
