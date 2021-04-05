package com.psl.training.ass2;

import java.util.*;

public class Combination {
	static ArrayList<String> combinations = new ArrayList<String>();
	
	static void  getCombinations(String str) {
		getPermutn(str, "");
	}
	
	static void getPermutn(String str, String ans){
        if (str.length() == 0) {
        	combinations.add(ans);
        	return;
        }
  
        for (int i = 0; i < str.length(); i++) {
        	char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            getPermutn(remaining, ans + ch);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCombinations("asd");
		for(String str:combinations) {
			System.out.println(str);
		}
	}

}
