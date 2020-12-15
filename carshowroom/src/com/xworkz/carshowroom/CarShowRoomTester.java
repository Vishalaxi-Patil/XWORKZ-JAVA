package com.xworkz.carshowroom;
import com.xworkz.carshowroom.dto.ManagerDTO;
import com.xworkz.carshowroom.showroom.CarShowRoom;

public class CarShowRoomTester {

	public static void main(String[] args) {
		CarShowRoom carShowRoom=new CarShowRoom();
		carShowRoom.addManager("Vishalaxi",9877665457l);
		carShowRoom.displayManager();
		carShowRoom.removeManager();
		carShowRoom.displayManager();
		
		ManagerDTO dto=new ManagerDTO("shush",9876655434L);
		carShowRoom.addManager(dto);
		carShowRoom.displayManager();
		carShowRoom.updateManager(6789786757l);
		carShowRoom.updateManager("Veeresh");
		carShowRoom.displayManager();
		
	}

}










