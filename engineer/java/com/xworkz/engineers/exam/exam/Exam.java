package com.xworkz.engineers.exam.exam;

public class Exam {
	private String examCode;
	private static String university="VTU";
	private String univerSity="vtu";
	private int fees;
	private HallTicket hallTicket;
	
	public Exam(String examCode,int fees)
	{
		System.out.println("**************************");
		this.examCode=examCode;
		this.fees=fees;
	}
	public Exam()
	{ 
		System.out.println("**************************");
		System.out.println("Default constructor");
	}
	
	/**
	 * This method is only for fun, to understand over-riding annotation
	 * 
	 * @param hallTicket
	 * @return
	 */
	public void testOverride(String name, int age, double fees, double take, String email, int a, char d, char e) {

	}
	
	public boolean allow(HallTicket hallTicket)
	{
		System.out.println("**************************");
		boolean there=false;
		System.out.println("Invoked allow");
		if(this.fees>=1000)
		{
			System.out.println("fess is paid");
			if(hallTicket!=null) {
				there=true;
				this.hallTicket=hallTicket;
				this.hallTicket.displayDetails();
				System.out.println("Exam code::"+this.examCode);
			}else {
				System.out.println("hall ticket is not there");
			}
		}
		else
		{
			System.out.println("Fess is less");
		}
		return there;
	}
	
	
	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public static String getUniversity() {
		return university;
	}
	public String getUniverSity() {
		return univerSity;
	}
	
	
	
}
		


