package com.xworkz.online;

public class PhoneDirectoryTester {

	public static void main(String[] args) {
		System.out.println("JVM invoked main");
		System.out.println("Total phoneNubers to search::" + PhoneDirectory.totalPhoneNumbers());
		PhoneDirectory.searchNumber(78653L);
		System.out.println("Exit::main");

	}

}
