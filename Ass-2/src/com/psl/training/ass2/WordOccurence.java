package com.psl.training.ass2;

public class WordOccurence {
	static int check(String sentence,String word){
		String[] splited = sentence.trim().split("\\s+");
		int count = 0;
		for(String s:splited) {
			if(s.toLowerCase().equals(word.toLowerCase())) {
				count+=1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I love to play Football and I love gardening";
		String word = "Love";
		System.out.println(check(sentence,word));
	}

}
