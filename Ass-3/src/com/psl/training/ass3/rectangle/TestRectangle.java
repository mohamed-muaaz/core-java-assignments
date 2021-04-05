package com.psl.training.ass3.rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		r1.setLength(20);
		r1.setWidth(10);
		System.out.println("Rectangle 1");
		System.out.println("length : " + r1.getLength());
		System.out.println("width : " + r1.getWidth());
		System.out.println("area : " + r1.getArea());
		System.out.println();
		
		Rectangle r2 = new Rectangle(25, 50);
		System.out.println("Rectangle 2");
		System.out.println("length : " + r2.getLength());
		System.out.println("width : " + r2.getWidth());
		System.out.println("area : " + r2.getArea());
		System.out.println();
		
		Rectangle r3 = new Rectangle();
		r3.setLength(120);
		r3.setWidth(75);
		System.out.println("Rectangle 3");
		System.out.println("length : " + r3.getLength());
		System.out.println("width : " + r3.getWidth());
		System.out.println("area : " + r3.getArea());
		System.out.println();

	}

}
