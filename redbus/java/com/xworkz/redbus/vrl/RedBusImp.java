package com.xworkz.redbus.vrl;

import com.xworkz.redbus.contract.RedBusContract;

public class RedBusImp implements RedBusContract{
	
	@Override
	public int minBooking() {
		System.out.println("Invoked minBooking");
		return 20;
	}
	
	@Override
	public boolean busWarranty() {
		System.out.println("Invoked busWarranty");
		return true;
	}

}
