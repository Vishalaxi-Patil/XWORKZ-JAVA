package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;

public class CommonDTO {
	
	private String name;
	private int age;
	private Date date;
	private AddressDTO addressDTO;
	private long mobileNo;
	private Gender gender;
	private BloodGroup bloodGroup;
	
	public CommonDTO() {
		System.out.println("Invoked CommonDTO");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public CommonDTO(String name, int age,Date date, AddressDTO addressDTO, long mobileNo, Gender gender,
			BloodGroup bloodGroup) {
		super();
		this.name = name;
		this.age = age;
		this.date = date;
		this.addressDTO = addressDTO;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
	}


	@Override
	public String toString() {
		return "CommonDTO [name=" + name + ", age=" + age + ", date=" + date + ", addressDTO=" + addressDTO
				+ ", mobileNo=" + mobileNo + ", gender=" + gender + ", bloodGroup=" + bloodGroup + "]";
	}
	
	}


