package com.xworkz.event;

public class FinallyTester {
	
	public static void main(String[] args) {
		
		try {

			System.out.println("stmt 1");
			System.out.println("stmt 1");
			//return; // finally block wil not excute
			throw new IllegalAccessException("this is testing");
			//System.exit(1);
		} catch (Exception e) {
			//e.printStackTrace();
			System.err.println("Exception in main"+e.getMessage());
		}
		finally {
			System.out.println("this is in finally, to close resources");
		}
		System.out.println("this is after catch");
	}
	

}
