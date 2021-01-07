package com.xworkz.copy.dto;

public class PhoneBookDTO implements Cloneable{
	
	private String name;
	private int pincode;
	private long phoneNo;
	
	public PhoneBookDTO() {
		System.out.println("Invoked PhoneBookDTO");
	}
	
	public String getName() {
		return name;
	}
	public int getPincode() {
		return pincode;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public int hashCode() {
		System.out.println("overide hashCode");
		return 54;
	}

	@Override
	public String toString() {
		return "PhoneBookDTO [name=" + name + ", pincode=" + pincode + ", phoneNo=" + phoneNo + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		  System.out.println("Overide equals");
		  if(obj!=null) {
			  System.out.println("obj is not null");
			  if(this==obj) {
				  System.out.println("Both objects are pointing to same instance");
				  return true;
			  }else {
				  if(obj instanceof PhoneBookDTO) {
					  PhoneBookDTO cast=(PhoneBookDTO)obj;
					  if(cast.getPhoneNo()>0 && cast.getPhoneNo()==cast.phoneNo) {
						  System.out.println("PhoneNo is equal");
						  return true;
					  }else {
						  System.out.println("PhoneNo is not equal");
					  }
				  }
			  }
		  }
		System.out.println("Obj is not null");
		return false;
	}
	@Override
	public  PhoneBookDTO clone() throws CloneNotSupportedException {
		 System.out.println("Override clone");
		return (PhoneBookDTO)super.clone();
	}
	
}
	
	


