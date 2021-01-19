package com.xworkz.event;

import com.xworkz.event.business.EmailService;

public class EmailLimitTester {
	
	public static void main(String[] args) {
		
		EmailService service=new EmailService();
		service.addEmail("vishalaxi@gmail.com");
		service.addEmail("vishalaxi@gmail.com");
		service.addEmail("vishalaxi@gmail.com");
		service.addEmail("vishalaxi@gmail.com");
	}

}
