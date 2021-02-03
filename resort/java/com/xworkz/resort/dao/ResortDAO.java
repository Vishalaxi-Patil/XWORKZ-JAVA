package com.xworkz.resort.dao;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortDAO {

	boolean save(ResortDTO dto);

	int totalSize();

	boolean updateLocationByName(String location, String name);

	boolean updateLocationByNameAndRattings(String location, String name, float rattings);

	boolean deleteByNameAndLocation(String name, String location);

	List<ResortDTO> getAll();

	boolean addMultipleResorts(List<ResortDTO> dtos);

}
