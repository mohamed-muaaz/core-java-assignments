package com.psl.training.ass2;

public class Replacer {
	static String findAndReplace(String sentence, String key, String source) {
		String[] splited = sentence.trim().split("\\s+");
		String result = "";
		
		for(int i=0; i<splited.length; i++) {
			if(splited[i].equals(key)) {
				splited[i]=source;
				
			}
			System.out.println(splited[i]);
			result += splited[i] + " ";
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Nimal is a good boy. Nimal is 10 years old.";
		String key = "Nimal";
		String source = "Kamal";
		String result = findAndReplace(sentence, key, source);
		System.out.println(result);
	}

}
