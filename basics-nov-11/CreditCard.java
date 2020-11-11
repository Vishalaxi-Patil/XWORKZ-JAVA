package com.xworkz.basics;

public class CreditCard {
	private static int totalAmount;
	private static int limit=1000;
	public static void request(int amount,String day)
	{
		System.out.println("invoked request***************************");
		System.out.println("amount::" +amount);
		System.out.println("day::" +day);
		totalAmount=amount+totalAmount;
		System.out.println("total amount of requested::" +totalAmount);
		System.out.println("Exit request******************************");
		
	}
	public static void expenditure(int amount)
	{
		System.out.println("invoked expenditure******************************");
		System.out.println("limited amount amount expenditure::" +limit);
		if(amount<limit)		{
			System.out.println("user can use thsese much od money because it should be less than limit::" +amount);
			totalAmount=totalAmount-amount;
			System.out.println("remaning amount::" +totalAmount);
		}
		else
		{
			System.out.println("Expenditure amount exceeds limit so cant spend much of amount amount should be less than limit");
		}
	    //totalAmount=limit-totalAmount;
	    //System.out.println("total amount after expenditure::" +totalAmount);
	    
		System.out.println("Exit expenditure*************************************");
	}
	

}
