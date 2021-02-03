package com.xworkz.beach.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.beach.dto.BeachDTO;

public class BeachComparableTester {

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
		//System.out.println(listOfBeachDTO);
		
		Collections.sort(listOfBeachDTO);
		System.out.println("After Soting");
		for (BeachDTO beachDTO : listOfBeachDTO) {
			System.out.println(beachDTO);
			
		}

	}

}
