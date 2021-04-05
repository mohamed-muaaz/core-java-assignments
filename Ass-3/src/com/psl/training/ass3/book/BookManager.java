package com.psl.training.ass3.book;

import java.util.*;

public class BookManager {
	private ArrayList<Book> books;
	
	private void createBooks() {
		String[] titles = {"Book1", "Book2", "Book3"};
		double[] prices = {250.00, 375.00, 650.00};
		String[] authers = {"auther1", "auther2", "auther3"};
		String[] publications = {"publication1", "publication2", "publication3"};
		
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		book1.setTitle(titles[0]);
		book1.setPrice(prices[0]);
		book1.setAuther(authers[0]);
		book1.setPublication(publications[0]);
		
		book2.setTitle(titles[1]);
		book2.setPrice(prices[1]);
		book2.setAuther(authers[1]);
		book2.setPublication(publications[1]);
		
		book3.setTitle(titles[2]);
		book3.setPrice(prices[2]);
		book3.setAuther(authers[2]);
		book3.setPublication(publications[2]);
		
		books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
	}
	
	private void showBooks() {
		System.out.println("Title\tPrice");
		for (Book b:books) {
			System.out.println(b.getTitle()+"\t"+b.getPrice());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager bm = new BookManager();
		bm.createBooks();
		bm.showBooks();
	}

}
