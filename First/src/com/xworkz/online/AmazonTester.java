package com.xworkz.online;

public class AmazonTester {

	public static void main(String[] args) {
		System.out.println("Invoked main");
		System.out.println("Total items to search" + Amazon.totalItems());
		Amazon.search("watch");
		System.out.println("Exit::main");
	}

}
