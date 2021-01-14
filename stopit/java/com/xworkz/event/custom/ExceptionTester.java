package com.xworkz.event.custom;

public class ExceptionTester {

	public static void main(String[] args) throws CustomCheckedException {
		ExceptionThrower thrower = new ExceptionThrower();
		try {
			thrower.checked();
		} catch (CustomCheckedException checkedException) {
			System.err.println(checkedException.getMessage());
		}
		try {
			thrower.unchecked();
		} catch (CustomUncheckedException uncheckedException) {
			System.err.println(uncheckedException.getMessage());
		}

	}

}
