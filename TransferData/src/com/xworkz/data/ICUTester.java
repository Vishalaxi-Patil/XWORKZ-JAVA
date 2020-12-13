package com.xworkz.data;
import com.xworkz.data.dto.ICU;
import com.xworkz.data.dto.ICUAdmissionDetails;

public class ICUTester {

	public static void main(String[] args) {
		ICU icu=new ICU(true,1000,false);
		System.out.println("Availablity of tv in ICU::"+icu.isTvAvailable());
		System.out.println("Price of ICU per day::"+icu.getPrice());
		System.out.println("Availablity of ventilator::"+icu.isVentilatorAvailable());
		System.out.println("****************************************************");
		icu.ICUAdmissionDetails("Akash","Accident","Joshi","Jayalaxmi");
		ICUAdmissionDetails dto=icu.getIcuAdmissionDetails();
		System.out.println("Patient name::"+dto.getPatientName());
		System.out.println("Doctor name::"+dto.getDoctorName());
		System.out.println("Nurse name::"+dto.getNurseAssigned());
		System.out.println("severity::"+dto.getSeverity());
		System.out.println("*****************************************************");
		icu.updateDoctor("Aishwary B");
		System.out.println("Update doctor name::"+dto.getDoctorName());
		System.out.println("****************************************************");
		icu.updatePrice(2000);
		System.out.println("Updated price::"+dto.getPrice());
		icu.updateDoctorNameAndNurseAssigned("Vishalaxi", "shushma");
	    System.out.println("Updated doctor name again::"+dto.getDoctorName());
	    System.out.println("Update nurse name::"+dto.getNurseAssigned());
		
		
		
	  

	}

}
