package com.xworkz.redbus;

import com.xworkz.redbus.agency.TravelAgency;
import com.xworkz.redbus.contract.RedBusContract;
import com.xworkz.redbus.vrl.RedBusImp;

public class RedBusTester {

	public static void main(String[] args) {
		
		RedBusContract contract=new RedBusImp();
		TravelAgency travelAgency=new TravelAgency(contract);
		travelAgency.acceptBooking();
		
		TravelAgency child=(TravelAgency)contract;
		
		
	}

}
