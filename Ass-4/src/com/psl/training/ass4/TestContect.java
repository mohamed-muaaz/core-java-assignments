package com.psl.training.ass4;

public class TestContect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactStack stack = new ContactStack(2); 
		
		Contact c = new Contact();
		c.firstName = "Muaaz";
		c.lastName = "Fahmy";
		c.dob = new Date();
		c.dob.year = 1996;
		c.dob.month = 2;
		c.dob.day = 14;
		c.email = "asdf@gmail.com";
		c.mobileNumber = "0773350088";
		
		Contact c2 = new Contact();
		c2.firstName = "Muaaz";
		c2.lastName = "Fahmy";
		c2.dob = new Date();
		c2.dob.year = 1996;
		c2.dob.month = 2;
		c2.dob.day = 14;
		c2.email = "asdf@gmail.com";
		c2.mobileNumber = "0773350088";
		
		try {
			stack.push(c);
			stack.push(c2);
			stack.pop();
			stack.pop();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
