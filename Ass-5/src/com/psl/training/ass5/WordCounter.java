package com.psl.training.ass5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
	public int countWords(String filePath) {
		File file = new File(filePath);
		int wordCount = 0;
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				wordCount += data.split(" ").length;
				System.out.println(data);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wordCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCounter wc = new WordCounter();
		int wordCount = wc.countWords("TestDir\\outer 4.txt");
		System.out.println("\nWords : " +  wordCount);
	}

}
