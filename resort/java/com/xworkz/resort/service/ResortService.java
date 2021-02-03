package com.xworkz.resort.service;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortService {

	boolean validationAndSave(ResortDTO resortDTO);
	
	boolean updateLocationByName(String location, String name);
	
	boolean updateLocationByNameandRating(String location, String name, float rating);
	
	boolean deleteByNameAndLocation(String name, String location);
	
	int totalResortSize();
	
	List<ResortDTO> getAll();
	
	boolean addMultipleResorts(List<ResortDTO> dtos);


}
