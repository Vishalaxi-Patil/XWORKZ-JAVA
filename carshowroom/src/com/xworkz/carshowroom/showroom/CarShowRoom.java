package com.xworkz.carshowroom.showroom;
import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.dto.ManagerDTO;

public class CarShowRoom {
	
		private String name;
		private String location;
		private ManagerDTO managerDTO;
		private CarDTO[] cars = new CarDTO[5];
		private int currentIndex = 0;
		
		
		public CarShowRoom() {
			System.out.println("CarShowRoom default constructor");
		}


		public CarShowRoom(String name, String location) {
			super();
			this.name = name;
			this.setLocation(location);
		}
		
		public void addManager(String name,long contactNo) {
			if(name!=null && contactNo>0) {
				this.managerDTO=new ManagerDTO(name,contactNo);
				System.out.println("manager added, data is valid");
			} else {
				System.out.println("provide proper details,data is invalid");
			}
		}
		
		public void addManager(ManagerDTO dto) {
			if(dto!=null) {
				this.managerDTO=dto;
				System.out.println("manager added");
			} else {
				System.out.println("manager not added, data is invalid");
			}
		}
		
		public void displayManager() {
			if(this.managerDTO!=null) {
				System.out.println(this.managerDTO.getName());
				System.out.println(this.managerDTO.getContactNo());
			} else {
				System.out.println("manager is not there :: null");
			}
		}
		
		public void removeManager() {
			this.managerDTO=null;
		}
		
		public void updateManager(long contactNo) {
			if(contactNo>0 && this.managerDTO!=null) {
				this.managerDTO.setContactNo(contactNo);
				System.out.println("details are valid, updated contact number");
			} else {
				System.out.println("cannot update contact number,data is invalid");
			}
			
		}
		public void updateManager(String name) {
			if(name!=null && this.managerDTO!=null) {
				this.managerDTO.setName(name);
				System.out.println("details are valid, updated name");
			} else {
				System.out.println("cannot update name,data is invalid");
			}
		}
		public void addCar(CarDTO dto) {
			if (dto != null && this.currentIndex < 5) {
				System.out.println("we can add car");
				System.out.println("current index : " + this.currentIndex);
				this.cars[currentIndex] = dto;
				this.currentIndex++;
			} else {
				if (dto == null) {
					System.out.println("we cannot add an empty or null ");
				}
				if (dto != null) {
					System.out.println("cannot add more car, total  " + this.currentIndex);
				}
				System.out.println("current index : " + this.currentIndex);
			}
		}
		
		public void displayCars()
		{
			//loop and display cars
		}


		public String getName() {
			return name;
		}


		public String getLocation() {
			return location;
		}


		public void setLocation(String location) {
			this.location = location;
		}


		 
}
	