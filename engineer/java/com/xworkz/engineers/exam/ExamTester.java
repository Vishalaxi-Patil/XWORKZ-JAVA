package com.xworkz.engineers.exam;

import com.xworkz.engineers.exam.exam.Exam;
import com.xworkz.engineers.exam.exam.HallTicket;
import com.xworkz.engineers.exam.exam.SupplimentoryExam;

public class ExamTester {

	public static void main(String[] args) {
		Exam exam=new Exam();
		System.out.println(Exam.getUniversity());
		exam.setFees(4000);
		exam.setExamCode("15CS61");
		
		HallTicket hallTicket=new HallTicket("2KACS034",6,"Chinnu");
		boolean allowed=exam.allow(hallTicket);
		if(allowed)
		{
			System.out.println("can write exam");
		}else {
			System.out.println("cannot write exam");
		}
		//static variable
		SupplimentoryExam supplimentoryExam=new SupplimentoryExam();
		System.out.println(supplimentoryExam.getUniversity());
		
		Exam supplimentoryExam1=new SupplimentoryExam();
		System.out.println(supplimentoryExam1.getUniversity());
		
		SupplimentoryExam supplimentoryExam2=(SupplimentoryExam)supplimentoryExam1;
		System.out.println(supplimentoryExam2.getUniversity());
		System.out.println("**********************************");
		
		//non static variable
		SupplimentoryExam supplimentoryExam3=new SupplimentoryExam();
		System.out.println(supplimentoryExam3.getUniverSity());
		
		Exam exam2=new SupplimentoryExam();
		System.out.println(exam2.getUniverSity());
		
		SupplimentoryExam exam3=(SupplimentoryExam)exam2;
		System.out.println(exam3.getUniverSity());
		
				
        

	}

}
