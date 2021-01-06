package com.xworkz.mutipleinheritance.impl;

import java.io.Serializable;

import com.xworkz.mutipleinheritance.diamondproblemsolved.Contract;
import com.xworkz.mutipleinheritance.diamondproblemsolved.RedBusContract;
import com.xworkz.mutipleinheritance.diamondproblemsolved.Security;

public class RedBusImp implements RedBusContract{
	
	@Override
	public int maxBooking() {
		System.out.println("Invoked maxBooking");
		return 0;
	}

	@Override
	public void open() {
		System.out.println("Invoked open");
		
	}

	@Override
	public void close() {
		System.out.println("Invoked close ");
		
	}
	

}
