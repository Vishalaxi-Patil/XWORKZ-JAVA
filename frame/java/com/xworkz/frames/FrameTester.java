package com.xworkz.frames;

import com.xworkz.frames.frame.ExceptionalEvent;

public class FrameTester {
	public static void main(String[] args) throws Throwable {
		
		ExceptionalEvent event=new ExceptionalEvent();

		event.frame1();
		System.out.println("*************");
		event.frame2();
		
		System.out.println("**************");
		event.frame3();
		
		System.out.println("***************");
		event.frame4();
		
		System.out.println("*************");
		event.frame5();
		
		
	}

}
