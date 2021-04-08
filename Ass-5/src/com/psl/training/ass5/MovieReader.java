package com.psl.training.ass5;


import java.io.*;
import java.util.*;

import com.psl.training.ass5.model.Movie;
import com.psl.training.ass5.model.Date;

public class MovieReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieReader mr = new MovieReader();
		List<Movie> movies = mr.readMovies("movies.txt");
		for(Movie m:movies) {
			System.out.println(m.getId());
			System.out.println(m.getName());
			System.out.println(m.getLanguage());
			System.out.println(m.getDate()+"\n");
		}
	}
	
	public List<Movie> readMovies(String filePath){
		List<Movie> movies = new ArrayList<Movie>();
		File file = new File(filePath);
		
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String[] splitted = reader.nextLine().split(",");
				Movie m = new Movie();
				m.setId(splitted[0]);
				m.setName(splitted[1]);
				m.setLanguage(splitted[2]);
				m.setDate(new Date(splitted[3]));
				movies.add(m);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return movies;
	}

}

