package com.xworkz.basics;

public class PocketMoney {
	
	private static double totalAmount;
	public static void request(double amount,String day)
	{
		System.out.println("invoked request");
		System.out.println("amount::" +amount);
		System.out.println("day::" +day);
		totalAmount=amount+totalAmount;
		System.out.println("total amount in request method::" +totalAmount);
		
		
		System.out.println("Exit::request");
		
	}

	public static void expenditure(double amount) {
		System.out.println("invoked expenditure");
		System.out.println("expenditure amount::" +amount);
		totalAmount=amount-totalAmount;
		System.out.println("total amount in expenditure method::" +totalAmount);
		
	}

	public static double getTotalAmount()
	{
		 
		 System.out.println("total remaining amount::" +totalAmount);
	     return totalAmount;
	}

	}
