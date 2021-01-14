package com.xworkz.event.custom;

public class ExceptionThrower {

	public void checked() throws CustomCheckedException {
		CustomCheckedException checkedException = new CustomCheckedException("This is testing checked");
		throw checkedException;
	}

	public void unchecked() {
		throw new CustomUncheckedException("This is testing unchecked");
	}

}
