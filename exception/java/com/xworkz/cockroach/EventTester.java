package com.xworkz.cockroach;

import com.xworkz.cockroach.event.ExceptionalEvent;

public class EventTester {
	public static void main(String[] args) throws Throwable {
		ExceptionalEvent event=new ExceptionalEvent();
		event.createdExceptionalEvent(false);
		System.out.println("*******************");
		event.createdExceptionalEvent(true);
		
	}

}
