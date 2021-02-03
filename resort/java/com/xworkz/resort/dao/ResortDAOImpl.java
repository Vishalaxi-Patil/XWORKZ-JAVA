package com.xworkz.resort.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.resort.dto.ResortDTO;
//import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	List<ResortDTO> resorts;

	public ResortDAOImpl(List<ResortDTO> resorts) {
		System.out.println("Invoked ResortDAOImpl");
		this.resorts = resorts;
	}

	@Override
	public boolean save(ResortDTO dto) {

		boolean created = false;
		boolean contains = this.resorts.contains(dto);
		if (!contains) {
			System.out.println("Invoked create");
			System.out.println(
					"dto is added beacuse this dto which constains  name and location are not therebefore:" + dto);
			created = this.resorts.add(dto);
			System.out.println("added");
		} else {
			System.out.println(
					"dto is not added beacuse this dto which constains name and location is already there:" + dto);
		}
		if (created) {
			System.out.println("resorts is saved");
			return true;

		} else {
			System.out.println("resorts is not saved");
		}
		return false;

	}

	@Override
	public int totalSize() {
		System.out.println("Invoked size");
		return this.resorts.size();
	}

	@Override
	public boolean updateLocationByName(String location, String name) {
		System.out.println("Invoked updateLocationByName");
		System.out.println("updating location is " + location + " for the resort " + name);
		for (ResortDTO resortDTO : resorts) {
			if (resortDTO.getName().equals(name)) {
				System.out.println("name " + name + " is found so update location from " + resortDTO.getLocation()
						+ " to " + location);
				resortDTO.setLocation(location);
				System.out.println(resortDTO);
				return true;

			} else {
				System.out.println("name is not found");
				return false;
			}

		}

		return false;
	}

	@Override
	public boolean updateLocationByNameAndRattings(String location, String name, float rattings) {
		System.out.println("Invoked updateLocationByNameAndRattings");
		System.out.println("updating location is " + location + " for the resort " + name + " which has " + rattings
				+ " rattings");
		for (ResortDTO resortDTO : resorts) {
			if (resortDTO.getName().equals(name) && resortDTO.getRatings() == rattings) {
				System.out.println("name and rattings are matched so update location");
				resortDTO.setLocation(location);
				System.out.println(resortDTO);
				return true;
			} else {
				System.out.println("name and rattings are not matched so don't update location");
			}

		}
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		System.out.println("Invoked deleteByNameAndLocation");
		System.out.println("deleting if name " + name + " and Location " + location + " matches");
		Iterator<ResortDTO> iterator = resorts.iterator();
		while (iterator.hasNext()) {
			ResortDTO next = iterator.next();
			if (next.getName().equals(name) && next.getLocation() == location) {
				System.out.println("removed");
				iterator.remove();
				System.out.println(next);
				return true;
			}

		}
		return false;
	}

	@Override
	public List<ResortDTO> getAll() {
		System.out.println("Invoked getAll");
		return this.resorts;
	}

//	@Override
//	public boolean addMultipleResorts(List<ResortDTO> dtos) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {
		System.out.println("Invoked addMultipleResorts");
		System.out.println("arg1:" + dtos);
		if(dtos!=null) {
		boolean added = dtos.addAll(resorts);
		System.out.println("mutiple data added:"+added);
		return true;
		}

		return false;
	}
}


