package com.xworkz.data;
import com.xworkz.data.dto.CompanyDTO;

public class CompanyDTOTester {

	public static void main(String[] args) {
		CompanyDTO company=new CompanyDTO();
		System.out.println(company.getName());
		System.out.println(company.getLocation());
		System.out.println("****************************************************");
		CompanyDTO company2=new CompanyDTO("TCS","MNC","Banglore",5678,"www.tcs.com");
		System.out.println(company2.getCompanyId());
		System.out.println(company2.getName());
		System.out.println(company2.getLocation());
		System.out.println(company2.getType());
		System.out.println(company2.getWebSite());
		company2.setName("Wipro");
		System.out.println(company2.getName());
		
	}

}
