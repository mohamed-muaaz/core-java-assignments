package com.psl.training.ass1;

public class Vowel {
	static boolean checkAlpha(char alph) {
		char[] vowels = {'a','e','i','o','u'};
		for (char vowel:vowels) {
			if(Character.toLowerCase(alph) == vowel) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkAlpha('u'));
	}

}
