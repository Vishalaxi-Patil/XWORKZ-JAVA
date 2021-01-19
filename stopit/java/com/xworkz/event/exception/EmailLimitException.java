package com.xworkz.event.exception;

public class EmailLimitException extends RuntimeException

{

	public EmailLimitException() {
		super();

	}
	
	public EmailLimitException(String message) {
		super(message);
	}
}
