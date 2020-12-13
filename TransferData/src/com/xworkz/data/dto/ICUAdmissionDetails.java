package com.xworkz.data.dto;

public class ICUAdmissionDetails {
	
	private String patientName;
	private String severity;
	private String doctorName;
	private String nurseAssigned;
	private int price;
	
	
	public ICUAdmissionDetails()
	{
		System.out.println("Default constructor");
		
	}
    public ICUAdmissionDetails(String patientName,String severity,String doctorName,String nurseAssigned)
    {
    	System.out.println("ICUAdmissionDetails constrctor is called with 4 parameter");
    	this.patientName=patientName;
    	this.severity=severity;
    	this.doctorName=doctorName;
    	this.nurseAssigned=nurseAssigned;
    }
    
    public String getPatientName() {
		return patientName;
	}
    public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
    public String getSeverity() {
    	return severity;
    }
    public void setSeverity() {
    	this.severity=severity;
    }
    public String getDoctorName() {
		return doctorName;
	}
    public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
    public String getNurseAssigned() {
		return nurseAssigned;
	}
    public void setNurseAssigned(String nurseAssigned) {
		this.nurseAssigned = nurseAssigned;
	}
	
	public void setPrice(int newPrice) {
		this.price=newPrice;
		
	}
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
    

}
