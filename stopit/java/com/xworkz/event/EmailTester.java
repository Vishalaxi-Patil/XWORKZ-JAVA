package com.xworkz.event;

import com.xworkz.event.business.Display;
import com.xworkz.event.exception.EmailValidationException;

public class EmailTester {
	public static void main(String[] args) throws EmailValidationException {
		Display display=new Display();
		try {
		display.printEmail("vishalaxigamil.com");
		}catch (EmailValidationException emailValidationException) {
			emailValidationException.printStackTrace();
		}
		
	}

}
