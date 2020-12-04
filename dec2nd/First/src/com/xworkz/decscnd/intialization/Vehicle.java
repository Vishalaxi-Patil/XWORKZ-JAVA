package com.xworkz.decscnd.intialization;

public class Vehicle {
	private String mfgDate;
	private String company;
	private int chasisN0;
	private String color;
	private String ownerName;
	
	public Vehicle(String company,int chasisNo,String mfgDate)
	{
		System.out.println("Vehicle constructor is called****************");
		this.company=company;
		this.chasisN0=chasisNo;
		this.mfgDate=mfgDate;
	}

	
	public String getCompany() {
		return company;
	}
	public int getChasisN0() {
		return chasisN0;
	}
	public String getMfgDate() {
		return mfgDate;
	}
	public void setColor(String color) {
		this.color = color;
		System.out.println(color);
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}

