package com.xworkz.constructor.decfrst;

public class Season {
	public String name;
	public String startMonth;
	
	public Season() 
	{
		System.out.println("Default constructor is called");
		
	}
	public Season(String name,String startMonth)
	{
		System.out.println("paramerized constructor is called with two parameter of type String and double");
		this.name=name;
		this.startMonth=startMonth;
		
	}
	
	

}
