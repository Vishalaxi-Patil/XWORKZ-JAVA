package com.xworkz.data;

import java.util.Arrays;

import com.xworkz.data.dto.CountryDTO;

public class CountryDTOTester {

	public static void main(String[] args) {
		CountryDTO country=new CountryDTO();
		System.out.println(country.getName());
		System.out.println(country.getContinent());
		System.out.println(country.getPopulation());
		CountryDTO country2=new CountryDTO("India");
		System.out.println("********************************************************");
		System.out.println(country2.getName());
		//more than one value we pass reference
		String countryName="India";
		country2.setName(countryName);
		String[] states= {"Andhra Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala"};
		System.out.println("********************************************************");
		CountryDTO country3=new CountryDTO("India", states);
		
		country3.setStates(states);
		System.out.println(Arrays.toString(states));
		//or using set method inside
		//country3.setStates(new String[]  {"Andhra Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala"};);
		country3.setStates(states);
		System.out.println(country3.getStates());
		//or using 
		String[] stateName=new String[3];
		stateName[0]="karnataka";
		stateName[1]="Goa";
		stateName[2]="Maharastra";
		System.out.println(stateName[0]);
		System.out.println(stateName[1]);
		System.out.println(stateName[2]);
		System.out.println("**************************************************");
		CountryDTO country4=new CountryDTO(1380004385l, "Narendra Modi", "Ram Nath Kovind");
		System.out.println(country4.getPopulation());
		System.out.println(country4.getPresident());
		String[] languages= {"Kannada","Hindi","English","Telgu","Tamail","Punjabi"};
		System.out.println("**********************************************************");
		CountryDTO country5=new CountryDTO("India", states,1380004385l ,"Narendra Modi" ,"Ram Nath Kovind" , languages);
		System.out.println(Arrays.toString(languages));
		
		
		
		
		
	}

}
