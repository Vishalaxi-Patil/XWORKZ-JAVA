package com.xworkz.resort.service;

import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dto.ResortDTO;

public class ResortServiceEmpl implements ResortService {

	ResortDAO dao;

	public ResortServiceEmpl(ResortDAO dao) {
		System.out.println("Invoked ResortServiceEmpl");
		this.dao = dao;
	}

	@Override
	public boolean validationAndSave(ResortDTO resortDTO) {

		boolean validData = false;
		if (resortDTO != null) {
			System.out.println("cosmeticDTO is not null so validate the fields");
			String name = resortDTO.getName();

			if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")) {
				System.out.println("name  is valid");
				validData = true;
			} else {
				System.out.println("name is invalid");
				validData = false;
			}

			if (validData) {
				String location = resortDTO.getLocation();
				if (location != null && !location.contains(" ") && !location.isEmpty() && location.length() >= 3
						&& location.length() <= 15 && !location.contains("@") && !location.contains("$")
						&& !location.contains("%")) {
					System.out.println("location is valid");
					validData = true;

				} else {
					System.out.println("location is invalid");
					validData = false;
				}
			}
			if (validData) {
				double price = resortDTO.getPrice();
				if (price >= 999 && price <= 2500) {
					System.out.println("price is valid");
					validData = true;
				} else {
					System.out.println("price is not valid");
					validData = false;
				}
			}
			if (validData) {
				float rattings = resortDTO.getRatings();
				if (rattings >= 0 && rattings <= 5) {
					System.out.println("valid ratting");
					validData = true;
				} else {
					System.out.println("Invalid ratting");
					validData = false;
				}
			}
			if (validData) {
				//String regex = "(0/91)?[7-9][0-9] {9}";
				long phoneNo = resortDTO.getPhoneNo();
				if (phoneNo == 10) {
					System.out.println("valid phoneNo");
					validData = true;
				} else {
					System.out.println("invalid phoneNo");
					validData = false;
				}
			}
			if (validData) {
				String managerName = resortDTO.getManagerName();
				if (managerName != null && !managerName.isEmpty() && !managerName.contains(" ")
						&& managerName.length() >= 3 && managerName.length() <= 12) {
					System.out.println("managerName is valid");
					validData = true;
				} else {
					System.out.println("managerName is invalid");
					validData = false;

				}

			}
			if (validData) {
				int workers = resortDTO.getNoOfWorkers();
				if (workers >= 5 && workers <= 25) {
					System.out.println("workers is valid");
					validData = true;

				} else {
					System.out.println("workers is invalid");
					validData = false;
				}
			}
			if (validData) {
				int rooms = resortDTO.getNoOfRooms();
				if (rooms >= 5 && rooms <= 25) {
					System.out.println("room is valid");
					validData = true;
				} else {
					System.out.println("room is invalid");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("dto is valid so save to dao ");
				dao.save(resortDTO);
				return true;
			}
		} else {
			System.out.println("dto is null");
		}

		return false;
	}

	@Override
	public boolean updateLocationByName(String location, String name) {
		System.out.println("Invoked updateLocationByName");
		if ((location != null && !location.contains(" ") && !location.isEmpty() && location.length() >= 3
				&& location.length() <= 15 && !location.contains("@") && !location.contains("$")
				&& !location.contains("%"))
				&& (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty()
						&& !name.contains(" "))) {
			System.out.println("location and name are valid so upadte them");
			this.dao.updateLocationByName(location, name);
			return true;
		} else {
			System.out.println("location and name are invalid so dont update location");
		}
		return false;
	}

	@Override
	public boolean updateLocationByNameandRating(String location, String name, float rating) {
		System.out.println("Invoked updateLocationByNameandRating");
		if ((location != null && !location.contains(" ") && !location.isEmpty() && location.length() >= 3
				&& location.length() <= 15 && !location.contains("@") && !location.contains("$")
				&& !location.contains("%")) && (rating >= 0 && rating <= 5)) {
			System.out.println("name,rattings and location are valid so upadte location");
			this.dao.updateLocationByNameAndRattings(location, name, rating);
			return true;
		} else {
			System.out.println("name,rattings and location are valid so upadte location");
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		System.out.println("Invoked deleteByNameAndLocation");
		if ((location != null && !location.contains(" ") && !location.isEmpty() && location.length() >= 3
				&& location.length() <= 15 && !location.contains("@") && !location.contains("$")
				&& !location.contains("%"))
				&& (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty()
						&& !name.contains(" "))) {
			System.out.println("name and location is valid so delete");
			dao.deleteByNameAndLocation(name, location);
			return true;
		} else {
			System.out.println("name location are invalid so cannot delete");
		}
		return false;
	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {
		System.out.println("Invoked addMultipleResorts");
		System.out.println("arg1:" + dtos);
		for (ResortDTO resortDTO : dtos) {
			System.out.println("resortDTO" + resortDTO);
			boolean addMultipleResorts = this.validationAndSave(resortDTO);

			System.out.println("addMultipleResorts:" + addMultipleResorts);
			return true;

		}
		return false;
	}

	@Override
	public int totalResortSize() {
		int size = dao.totalSize();
		return size;
	}

	@Override
	public List<ResortDTO> getAll() {
		List<ResortDTO> getAll = dao.getAll();
		return getAll;
	}

}
