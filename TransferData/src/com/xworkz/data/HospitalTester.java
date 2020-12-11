package com.xworkz.data;

import com.xworkz.data.dto.Appointment;
import com.xworkz.data.dto.Hospital;

public class HospitalTester {

	public static void main(String[] args) {
		Hospital hospital=new Hospital("Appola","Banglore");
		System.out.println(hospital.getName());
		System.out.println(hospital.getLocation());
		System.out.println("********************************************************");
		hospital.Appointment("Arpita",23,78932456l,"Cough","Arjun");
		Appointment appointment=hospital.getAppointment();
		System.out.println("Patient name::"+appointment.getPatientName());
		System.out.println("Doctor name::"+appointment.getDoctorName());
		//System.out.println("Patient mobile number::"+getContactNo());
	}

}
