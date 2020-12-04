package com.xworkz.decscnd;
import com.xworkz.decscnd.intialization.Vehicle;

public class VehicleTester {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle("Tata Motors",89000,"15/12/1980");
		System.out.println(vehicle.getCompany());
		System.out.println(vehicle.getChasisN0());
		System.out.println(vehicle.getMfgDate());
		vehicle.setColor("Black");
		vehicle.setOwnerName("Vishalaxi");
	}

}