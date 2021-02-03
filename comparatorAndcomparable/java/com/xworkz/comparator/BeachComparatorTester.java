package com.xworkz.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.beach.dto.BeachDTO;

public class BeachComparatorTester {

	public static void main(String[] args) {
		
		
		BeachDTO beachDTO1=new BeachDTO("om", 5);
		BeachDTO beachDTO2=new BeachDTO("Malpe", 54);
		BeachDTO beachDTO3=new BeachDTO("Juhu", 56);
		BeachDTO beachDTO4=new BeachDTO("Murdeshwar", 23);
		
		List<BeachDTO> listOfBeachDTO=new ArrayList<BeachDTO>();
		listOfBeachDTO.add(beachDTO1);
		listOfBeachDTO.add(beachDTO2);
		listOfBeachDTO.add(beachDTO3);
		listOfBeachDTO.add(beachDTO4);
		
		System.out.println("Before Soting");
		for (BeachDTO beachDTO : listOfBeachDTO) {
			System.out.println(beachDTO);
		}
		
	     BeachNoOfResortComparator comparator=new BeachNoOfResortComparator();
		Collections.sort(listOfBeachDTO, comparator);//overloaded version of sort
		System.out.println("After soring");
		 
		for (BeachDTO beachDTO : listOfBeachDTO) {
			System.out.println(beachDTO);
		}
		
		

	}

}
