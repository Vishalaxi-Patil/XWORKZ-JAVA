package com.xworkz.carshowroom;
import com.xworkz.carshowroom.showroom.CarShowRoom;

public class TempTester {

	public static void main(String[] args) {
		CarShowRoom room = new CarShowRoom("Hyndai RNS","RJ");

		room.displayManager();

		room = new CarShowRoom("NEXA","MG");

		CarShowRoom room2 = new CarShowRoom("Nav-shanthi","Hubli");
		room = room2;
		CarShowRoom room3=room;
		CarShowRoom room4=room2;
		
	}

}
