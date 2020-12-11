package com.xworkz.data.dto;
import com.xworkz.data.dto.Hospital;

public class Appointment {
	
	private String patientName;
	private long contactNo;
	private int age;
	private String reason;
	private String doctorName;
	
	public Appointment(String patientName, int age, long contactNo, String reason, String doctorName) {
		System.out.println("Appointment constrctor is called");
		this.patientName=patientName;
		this.contactNo=contactNo;
		this.age=age;
		this.reason=reason;
		this.doctorName=doctorName;
		
	}

	public String getPatientName() {
		return patientName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public int getAge() {
		return age;
	}

	public String getReason() {
		return reason;
	}

	public String getDoctorName() {
		return doctorName;
	}
	
}
	
	


