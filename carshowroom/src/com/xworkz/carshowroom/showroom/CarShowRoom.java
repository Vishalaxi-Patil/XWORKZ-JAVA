package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.constants.Varients;
import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.dto.ManagerDTO;

/** Declaring primitive and non primitive variables
 * @author Vishalaxi
 *
 */



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
	
	

	/** adding manager name by using method call addManager
	 * @param name
	 * @param contactNo
	 */
	public void addManager(String name, long contactNo) {
		if (name != null && contactNo > 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
			System.out.println("manager added, data is valid");
		} else {
			System.out.println("provide proper details,data is invalid");
		}
	}

	
	
	/**
	 * validating manager name
	 * @param dto
	 */
	public void addManager(ManagerDTO dto) {
		if (dto != null) {
			this.managerDTO = dto;
			System.out.println("manager added");
		} else {
			System.out.println("manager not added, data is invalid");
		}
	}
/**
 * displaying all the manager name and constactNo
 */
	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println(this.managerDTO.getContactNo());
		} else {
			System.out.println("manager is not there :: null");
		}
	}
    /**
     * removing manager
     */
	public void removeManager() {
		this.managerDTO = null;
	}
     /**
      * update contact no of manager
      * @param contactNo
      */
	public void updateManager(long contactNo) {
		if (contactNo > 0 && this.managerDTO != null) {
			this.managerDTO.setContactNo(contactNo);
			System.out.println("details are valid, updated contact number");
		} else {
			System.out.println("cannot update contact number,data is invalid");
		}

	}
	/**
	 * updating manager name
	 * @param name
	 */

	public void updateManager(String name) {
		if (name != null && this.managerDTO != null) {
			this.managerDTO.setName(name);
			System.out.println("details are valid, updated name");
		} else {
			System.out.println("cannot update name,data is invalid");
		}
	}
    /** 
     * adding cars to {@link CarDTO}
     * @param dto
     */
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

	public void displayCars() {
		// CarDTO[] tempCars=this.cars;
		for (int i = 0; i < this.cars.length; i++) {
			System.out.println("displayCars() method is called");
			CarDTO dto = this.cars[i];
			if(dto!=null)
			System.out.println(dto);
			System.out.println(dto.getName());
			System.out.println(dto.getPrice());
			System.out.println(dto.getVarients());
		}

	}

	public void updateCarVarients(Varients newNarients, int indexToUpdate) {
		if (newNarients != null && indexToUpdate >= 0 && indexToUpdate < 5) {
			System.out.println("updateCars method is called");
			System.out.println("car is found at index:" + indexToUpdate);
			System.out.println("update varient:" + newNarients);

			CarDTO carDTO = this.cars[indexToUpdate];
			carDTO.setVarients(newNarients);
		}
	}

	public void displayCarAtIndex(int indexToDisplay) {
		if (indexToDisplay > 0 && indexToDisplay < 5) {
			System.out.println("displayCarAtIndex method is called");
			CarDTO refVar = this.cars[indexToDisplay];
			System.out.println(refVar.getName());
			System.out.println(refVar.getPrice());
			System.out.println(refVar.getVarients());

		}

	}

	
	public void displayCarByModel(String model) {
		if (model != null) {
			System.out.println("searching for model "+model);
			boolean carFound = false;
			for (int index = 0; index < this.cars.length; index++) {
				CarDTO refOfCar = this.cars[index];
				String localModel = refOfCar.getName();
				if (localModel.equals(model)) {
					System.out.println("car is found");
					System.out.println(refOfCar.getPrice());
					System.out.println(refOfCar.getVarients());
					carFound = true;
					break;
				}
			}
			if (carFound == false) {
				System.out.println(model+" car is not found");
			}
		}
	}
	public void deleteCarByMOdel(String name)
	{
		if(name!=null) {
			System.out.println("delete model:"+name);
			
			for (int i = 0; i < this.cars.length; i++) 
			{
				boolean carDelete=false;
				CarDTO refForDeleteCar = this.cars[i];
				
				String localModel = refForDeleteCar.getName();
				if(localModel.equals(name)) {
					this.cars=null;
					System.out.println("Deleted car:"+name);
					carDelete= true;
					
					break;
					
				}
				
				
	}
			boolean carDelete=true;
			if ( carDelete== false) {
				System.out.println(name+" car is not deleted");
			}
		}
	
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
