package com.xworkz.frames.frame;

public class ExceptionalEvent {
	
	
	public ExceptionalEvent() {
		System.out.println("ExceptionalEvent called as default constructor");
	}
	public void createExceptionalEvent(boolean create) throws Throwable {
		System.out.println("Invoked createExceptionalEvent method");
		if(create) {
			System.out.println("craeted Exceptional event");
			Throwable throwable=new Throwable();
			throw throwable;
		}else {
			System.out.println("ExceptionalEvent not created");
		}
		
	}
	
	public void frame1() throws Throwable {
		System.out.println("frame1");
		frame2();
	}
	public void frame2() throws Throwable {
		System.out.println("frame2");
		frame3();
	}
	public void frame3() throws Throwable {
		System.out.println("frame3");
		frame4();
	}
	public void frame4() throws Throwable {
		System.out.println("frame4");
		frame5();
	}
	public void frame5() throws Throwable {
		System.out.println("frame5");
		createExceptionalEvent(false);
	}

}
