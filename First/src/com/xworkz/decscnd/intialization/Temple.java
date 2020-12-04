package com.xworkz.decscnd.intialization;

public class Temple {
	private String name;
	private String location;
	private float startTime;
	private String prasada;
	private float closeTime;
	
	public Temple(String name,String location,float startTime,String prasada,float closeTime)
	{
		System.out.println("Temple constructor is called");
		this.name=name;
		this.location=location;
		this.startTime=startTime;
		this.prasada=prasada;
		this.closeTime=closeTime;
	}

	public String getName(String name) {
		//this.name=name;
		return name;
		
	}

	public String getLocation(String location) {
		return location;
	}

	private float getstartTime(float startTime) {
		return startTime;
	}

	public String getPrasada(String prasada) {
		return prasada;
	}

	private float getCloseTime(float closeTime) {
		return closeTime;
	}

	

	public void setLocation(String location) {
		this.location = location;
		System.out.println("Updated loacation " + location);
	}

	
	

}
