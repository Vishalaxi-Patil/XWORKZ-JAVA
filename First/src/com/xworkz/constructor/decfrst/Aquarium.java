package com.xworkz.constructor.decfrst;

public class Aquarium {
	public String type;
	public String name;
	public double temp;
	public String size;
	
	public Aquarium(String type)
	{
		System.out.println("paramerized constructor with String type");
		this.type=type;
		System.out.println(type);
	}
	public Aquarium(String type,String name)
	{
		System.out.println("paramerized constructor with String and String type");
		this.type=type;
		this.name=name;
		System.out.println(type);
		System.out.println(name);
		
	}
	public Aquarium(String type,String name,double temp)
	{
		System.out.println("paramerized constructor with String,String and double type");
		this.type=type;
		this.name=name;
		this.temp=temp;
		System.out.println(type);
		System.out.println(name);
		System.out.println(temp +" degree celcius");
	}
	public Aquarium(String type,String name,double temp,String size)
	{
		System.out.println("paramerized constructor with String,String,double and String type");
		this.type=type;
		this.name=name;
		this.temp=temp;
		this.size=size;
		System.out.println(type);
		System.out.println(name);
		System.out.println(temp +"degree celcius");
		System.out.println(size);
	}
	public Aquarium(String name,double temp)
	{
		this.name=name;
		this.temp=temp;
		System.out.println(name);
		System.out.println(temp +"degree celcius");
	}
	
	
	

}
