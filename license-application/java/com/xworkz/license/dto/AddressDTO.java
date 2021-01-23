package com.xworkz.license.dto;

public class AddressDTO {
	
	private String city;
	private String landMark;
	private String street;
	private int pincode;
	private String buildingName;
	private String state;
	
	public AddressDTO() {
		System.out.println("Invoked AddressDTO");
	}

	public AddressDTO(String city, String landMark, String street, int pincode, String buildingName, String state) {
		super();
		this.city = city;
		this.landMark = landMark;
		this.street = street;
		this.pincode = pincode;
		this.buildingName = buildingName;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressDTO [city=" + city + ", landMark=" + landMark + ", street=" + street + ", pincode=" + pincode
				+ ", buildingName=" + buildingName + ", state=" + state + "]";
	}
	
	

}

  
