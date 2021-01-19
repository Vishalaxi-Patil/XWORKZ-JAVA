package com.xworkz.event.business;

import com.xworkz.event.exception.EmailLimitException;

public class EmailService {

	private int emailLimit = 3;
	private String[] emails = new String[this.emailLimit];
	private int index = 0;

	public EmailService() {
		System.out.println("Invoked EmailService");
	}

	public void addEmail(String email) {
		System.out.println("Invoked addEmail");
		System.out.println("Arg1:" + email);
		if (this.index < this.emails.length) {
			this.emails[this.index] = email;
			System.out.println("Added EMail");
			this.index++;
		} else {
			throw new EmailLimitException("max email limit reached.Limit is:" + this.emailLimit);
		}
	}

	public int getEmailLimit() {
		return emailLimit;
	}

	public void setEmailLimit(int emailLimit) {
		this.emailLimit = emailLimit;
	}

}
