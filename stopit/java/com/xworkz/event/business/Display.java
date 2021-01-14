package com.xworkz.event.business;

import com.xworkz.event.exception.EmailValidationException;

public class Display {

	public void printEmail(String email) throws EmailValidationException {
		if (email != null) {
			if (email.contains("@") && 
					(email.contains(".com") || email.contains(".in"))) {
			System.out.println("valid email");
			System.out.println(email);
		}else {
			EmailValidationException emailValidationException=new EmailValidationException("email should conatin @ and .com or .in");
			throw emailValidationException;
		}
	}
	}
}


