package com.xworkz.resort;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.service.ResortService;
import com.xworkz.resort.service.ResortServiceEmpl;

public class ResortServiceTester {

	public static void main(String[] args) {

		ResortDTO resortDTO = new ResortDTO();
		resortDTO.setName("Ayodya");
		resortDTO.setLocation("Banglore");
		resortDTO.setManagerName("Vishalaxi");
		resortDTO.setNoOfRooms(5);
		resortDTO.setNoOfWorkers(10);
		resortDTO.setOffers(true);
		resortDTO.setPhoneNo(10l);
		resortDTO.setPoolExist(true);
		resortDTO.setPrice(2000);
		resortDTO.setRatings(5);

		List<ResortDTO> resorts = new ArrayList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(resorts);

		ResortService service = new ResortServiceEmpl(dao);
		System.out.println("******************************");

		service.validationAndSave(resortDTO);
		System.out.println("**********************************");

		service.updateLocationByName("Mysore", "");
		System.out.println("*************************************");

		service.updateLocationByNameandRating("Hubli", "Ayodya", 5);
		System.out.println("***********************************");

		int size = service.totalResortSize();
		System.out.println("total size before:" + size);

		System.out.println("**************************************");
		List<ResortDTO> get = service.getAll();
		System.out.println("get:" + get);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		service.addMultipleResorts(resorts);
		System.out.println("************************");

		service.deleteByNameAndLocation("Ayodya", "Hubli");
		System.out.println("********************************");

		int size1 = service.totalResortSize();
		System.out.println("total size after deleting:" + size1);

		System.out.println("(((((((((((((((((((((((((((((((((((");

		List<ResortDTO> get1 = service.getAll();
		System.out.println("get after dleting:" + get1);

		System.out.println("**********************");

//		String number="7898789768";
//		String regex="(0/91)?[7-9][0-9]{9}";
//		System.out.println(number.matches(regex));

	}

}
