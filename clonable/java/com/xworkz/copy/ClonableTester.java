package com.xworkz.copy;

import com.xworkz.copy.dto.PhoneBookDTO;

public class ClonableTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		PhoneBookDTO dto=new PhoneBookDTO();
		dto.setName("Vish");
		dto.setPhoneNo(7876091235l);
		dto.setPincode(582101);
		
		PhoneBookDTO obj=dto.clone();
		System.out.println(obj.getName()+ " "+obj.getPhoneNo()+" "+obj.getPincode());
		
		/*
		Object obj1="X-workz";
		PhoneBookDTO cast=(PhoneBookDTO)obj1; Converting from String to PhoneBookDTO
		*/
		
		
		

	}

}
