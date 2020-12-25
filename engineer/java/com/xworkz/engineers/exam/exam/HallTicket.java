package com.xworkz.engineers.exam.exam;

public class HallTicket {
	private String ticketNo;
	private int noOfSubjects;
	private String stuName;
	
	
	/**
	 * @param ticketNo
	 * @param noOfSubjects
	 * @param studentName
	 */
	public HallTicket(String ticketNo, int noOfSubjects, String stuName) {
		System.out.println("********************");
		System.out.println("Invoked HallTicket constructor");
		this.ticketNo = ticketNo;
		this.noOfSubjects = noOfSubjects;
		this.stuName=stuName;
	}
	
	public void displayDetails()
	{
		System.out.println("**************************");
		System.out.println("Invoked displayDetails method");
		System.out.println(ticketNo);
		System.out.println(noOfSubjects);
		System.out.println(stuName);
		
	}

	
	
	
	

}
