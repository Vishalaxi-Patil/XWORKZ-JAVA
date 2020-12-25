package com.xworkz.engineers.exam.exam;

public class SupplimentoryExam extends Exam{
	
	public static String university="VTU Belgav";
	
	public String univerSity="vtu belgavi";
	
	public SupplimentoryExam()
	{
		System.out.println("Invoked SupplimentoryExam constructor");
		
	}
	/*
	public SupplementaryExam(String name)
	{
		
		System.out.println("calling over loaded const suppl");
	}*/
	
	@Override // annotations
	public boolean allow(HallTicket hallTicket) {
		System.out.println("invoked allow from SupplementaryExam");
		return super.allow(hallTicket);
	}
	
	
	
	public static String getUniversity() {
		return university;
	}
    public String getUniverSity() {
		return univerSity;
	}
	
	
	
	
	

}
