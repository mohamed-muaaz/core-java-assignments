package com.psl.training.ass4;

public class ContactStack {
	Contact[] contacts;
	private int pointer;
	
	public ContactStack(int size) {
		contacts = new Contact[size];
		pointer = 0;
	}
	
	public void push(Contact c) throws Exception {
		if(pointer == contacts.length) {
			throw new Exception("Stack is full!");
		}
		c.validate();
		System.out.println("Contact pushed successfully!");
		contacts[pointer++] = c;
	}
	
	public Contact pop() throws Exception {
		if (pointer==0) {
			throw new Exception("Cannot pop from empty stack!");
		}
		System.out.println("Contact poped!");
		return contacts[--pointer];
	}
}
