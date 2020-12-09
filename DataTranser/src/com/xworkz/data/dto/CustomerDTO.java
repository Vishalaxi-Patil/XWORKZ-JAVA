package com.xworkz.data.dto;

public class CustomerDTO {
	private int  customerId=1234;
	private String customerName;
	private long contactNo;
	private String email;
	
	public CustomerDTO()
	{
		System.out.println("CustomerDTO conctructor is caled");
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
