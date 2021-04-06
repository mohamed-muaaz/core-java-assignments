package com.psl.training.ass4;

class Date{
	int year, month, day;
}

public class Contact {
	String firstName, middleName, lastName = null;
	Date dob = null;
	String Gender = null;
	Date anniversary = null;
	String address, area, city = null;
	int pincode = 0;
	String state, country = null;
	String telephoneNumber, mobileNumber = null;
	String email, website = null;
	
	public void validate() throws Exception{
		if (firstName == null || lastName == null || 
				dob == null || email == null) {
			throw new Exception("Compulsory feilds cannot be left null!");
		}
		else if (!validateEmail(email)) {
			throw new Exception("E-mail is not valid. Please provide an email as \"abc@gmail.com\"");
		}
		else if (telephoneNumber == null && mobileNumber == null) {
			throw new Exception("Mobile number or telephone number should be given!");
		}
		else {
			System.out.println("Contact is valid!!!");
		}
	}
	
	private static boolean validateEmail(String email) {
		if (email!=null) {
			String[] splited = email.split("@");
			if(splited.length == 2 && splited[1].equals("gmail.com")) {
				return true;
			}
		}
		return false;
	}
}
