package com.xworkz.online;

public class HotelTester {

	public static void main(String[] args) {
		System.out.println("JVM Invoked main");
		System.out.println("total items to search::" +HotelMenuSearch.totalSearch());
		String price="40";
		byte convertToString=Byte.parseByte(price);
		
		HotelMenuSearch.search("Gobi",convertToString);
		System.out.println("Exit::main");
		

	}

}
