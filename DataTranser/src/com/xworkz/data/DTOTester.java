package com.xworkz.data;
import com.xworkz.data.dto.CustomerDTO;

public class DTOTester {
	public static void main(String[] args) {
		CustomerDTO customerDTO=new CustomerDTO();
		System.out.println(customerDTO.getCustomerName());
		System.out.println(customerDTO.getContactNo());
		System.out.println(customerDTO.getCustomerId());
		System.out.println(customerDTO.getCustomerName());
		System.out.println(customerDTO.getEmail());
		customerDTO.setContactNo(7896546745l);
		System.out.println(customerDTO.getContactNo());
		customerDTO.setCustomerName("Vishalaxi");
		System.out.println(customerDTO.getCustomerName());
		customerDTO.setCustomerId(7865);
		System.out.println(customerDTO.getCustomerId());
		customerDTO.setEmail("vishalaxi@gmail.com");
		System.out.println(customerDTO.getEmail());
		
		
	}

}
