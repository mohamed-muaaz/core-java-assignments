package com.psl.training.ass5;

import java.io.*;

public class Directory {
	static void listFiles(File[] files, int index, int level) {
		if(index==files.length)
			return;
		
		for(int i=0; i<level; i++) {
			System.out.print("\t");
		}
		
		if(files[index].isFile())
			System.out.println(files[index].getName());
		
		else if(files[index].isDirectory()) {
			System.out.println("<"+files[index].getName()+">");
			listFiles(files[index].listFiles(), 0, level+1);
		}
		
		listFiles(files, ++index, level);
	}
	
	public void displayFolderContents(String path) {
		File dir = new File(path);
		listFiles(dir.listFiles(), 0, 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = "TestDir";
		Directory d = new Directory();
		d.displayFolderContents(dir);
	}

}
