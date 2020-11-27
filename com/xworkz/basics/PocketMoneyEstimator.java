
package com.xworkz.basics;


public class PocketMoneyEstimator {
	public static void main(String[] args)
	{
		System.out.println("JVM invoked main");
		PocketMoney.request(25.0,"Monday");
		PocketMoney.request(100.0,"tuesday");
		PocketMoney.expenditure(100.0);
		PocketMoney.request(200.0,"friday");
		PocketMoney.expenditure(50.0);
		
		PocketMoney.getTotalAmount();
		
		
		
		
	}

}
