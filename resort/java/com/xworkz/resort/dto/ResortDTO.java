package com.xworkz.resort.dto;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDTO {

	private String name;
	private String managerName;
	private String location;
	private float ratings;
	private double price;
	private long phoneNo;
	private int noOfRooms;
	private int noOfWorkers;
	private boolean poolExist;
	private boolean offers;

	public ResortDTO() {
		System.out.println("Invoked ResortDTO");
	}

	public ResortDTO(String name, String location, float ratings, double price, long phoneNo, int noOfRooms) {
		super();
		this.name = name;
		this.location = location;
		this.ratings = ratings;
		this.price = price;
		this.phoneNo = phoneNo;
		this.noOfRooms = noOfRooms;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("overide equals");
		if (obj == null) 
			return false;
		
			if (obj instanceof ResortDTO) {
				ResortDTO cast = (ResortDTO) obj;
				if (cast.getName() != null && cast.getLocation()!= null && cast.getName().equals(this.name)
						&& cast.getLocation().equals(this.location)) {
					System.out.println("name and location are equal");
					return true;
				} else {
					System.out.println("barnd and cosmeticType are not equal");
					return false;

				}
			

		}
			return false;

	}


	@Override
	public String toString() {
		return "ResortDTO [name=" + name + ", managerName=" + managerName + ", location=" + location + ", ratings="
				+ ratings + ", price=" + price + ", phoneNo=" + phoneNo + ", noOfRooms=" + noOfRooms + ", noOfWorkers="
				+ noOfWorkers + ", poolExist=" + poolExist + ", offers=" + offers + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getName() {
		return name;
	}

	public String getManagerName() {
		return managerName;
	}

	public String getLocation() {
		return location;
	}

	public float getRatings() {
		return ratings;
	}

	public double getPrice() {
		return price;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public boolean isPoolExist() {
		return poolExist;
	}

	public boolean isOffers() {
		return offers;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	public void setPoolExist(boolean poolExist) {
		this.poolExist = poolExist;
	}

	public void setOffers(boolean offers) {
		this.offers = offers;
	}

}
