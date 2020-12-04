package com.xworkz.basics;

public class CreditCardEstimator {

	public static void main(String[] args) {
		System.out.println("JVM Invoked main*******************************");
		CreditCard.request(10000,"monday");
		CreditCard.expenditure(100);
		System.out.println("Exit::main************************************");


	}

}
