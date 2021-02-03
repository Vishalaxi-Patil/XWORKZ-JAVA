package com.xworkz.resort;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;

public class ResortTester {

	public static void main(String[] args) {

		List<ResortDTO> list = new ArrayList<ResortDTO>();

		ResortDTO resortDTO = new ResortDTO("Ayodya", "Banglore", 5, 4000, 6789675456l, 20);

		ResortDAO resortDAO = new ResortDAOImpl(list);
		resortDAO.save(resortDTO);
		System.out.println("***************************");

		int size = resortDAO.totalSize();
		System.out.println(size);
		System.out.println("********************************");

		resortDAO.updateLocationByName("Hubli", "Ayodya");
		System.out.println("************************************");

		resortDAO.updateLocationByNameAndRattings("Mysore", "Ayodya", 5);
		System.out.println("*************************************");

		List<ResortDTO> getAll = resortDAO.getAll();
		System.out.println("gettingAll:" + getAll);
		System.out.println("==============================================================");

		resortDAO.addMultipleResorts(list);

		System.out.println("*************************888");
		resortDAO.deleteByNameAndLocation("Ayodya", "Mysore");
		System.out.println("****************************");

		size = resortDAO.totalSize();
		System.out.println(size);

	}

}
