package com.xworkz.constructor.method;

public class Coffie {
	public int price=284;
	public int grams=100;
	public String coffiePowerderName="BRU";
public Coffie(int coffiePrice,int coffieInGrams,String name)
{
	System.out.println("Invoked Coffie Constructor");
	System.out.println("argument 1::"+price);
	System.out.println("arument 2::"+grams +"grams");
	System.out.println("argument 2::"+coffiePowerderName);
	price=coffiePrice;
	grams=coffieInGrams;
	coffiePowerderName=name;
	System.out.println("argument 1 value After::" +coffiePrice);
	System.out.println("argument 2 value After::" +coffieInGrams  +"grams");
	System.out.println("argument 3 value After::" +name);
	
}

}
