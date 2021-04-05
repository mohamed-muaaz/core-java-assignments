package com.psl.training.ass2;

public class Reverse {
	static String  makeReverse(String sentence) {
		String[] splited = sentence.trim().split("\\s+");
		String result = "";
		
		for (int i=0; i<splited.length; i++) {
			result += new StringBuffer(splited[i]).reverse().toString();
			result += " ";
		}
		return result;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeReverse("To be or not to be"));
	}
}
