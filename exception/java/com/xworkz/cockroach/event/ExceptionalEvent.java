package com.xworkz.cockroach.event;

public class ExceptionalEvent {
	
	public ExceptionalEvent() {
		System.out.println("Invoked ExceptionalEvent");
	}
	public void createdExceptionalEvent(boolean create)throws Throwable{
		System.out.println("Invoked createdExceptionalEvent method");
		if(create) {
			System.out.println("Created Exceptional event");
			Throwable throwable=new Throwable();
			throw throwable;
		}else {
			System.out.println("no exceptional event");
		}
		
	}

}
