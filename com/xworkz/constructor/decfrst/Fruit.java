package com.xworkz.constructor.decfrst;

public class Fruit {
	public String name;
	public double price;
	
	public Fruit()
	{
		System.out.println("default constructor is called");
	}
	public Fruit(String name,double price)
	{
		System.out.println("Parameterized constructor is called with one parameter");
		//this.name=name;
		//this.price=price;
		System.out.println(name);
		System.out.println(price);
		
		
	}
}
