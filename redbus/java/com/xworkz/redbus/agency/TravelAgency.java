package com.xworkz.redbus.agency;

import com.xworkz.redbus.contract.RedBusContract;

public class TravelAgency {
	private RedBusContract redBusContract;
	private String agencyName = new String("Vishalaxi travel agency");

	// private String agencyName1="Vishalaxi travel agency";
	public TravelAgency(RedBusContract redBusContract) {
		System.out.println("Invoked TravelAgency");
		this.redBusContract = redBusContract;
	}

	public void acceptBooking() {
		System.out.println("Invoked acceptBooking method");
		System.out.println("Check bookings for" + this.agencyName);
		boolean warranty = redBusContract.busWarranty();
		if (warranty) {
			System.out.println("Bus is under warranty");
			int booking = redBusContract.minBooking();
			if (booking > 0 && booking <=20) {
				System.out.println("can accept booking");
			} else {
				System.out.println("Cannot accept booking because minBoooking is<0 or>20");
			}
		}else {
			System.out.println("Bus is no under warranty");
		}
	}

}
