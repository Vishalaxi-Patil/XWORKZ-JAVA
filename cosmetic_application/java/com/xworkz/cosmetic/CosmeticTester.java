package com.xworkz.cosmetic;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.impl.CosmeticDAOImpl;

public class CosmeticTester {

	public static void main(String[] args) {

		CosmeticDTO cosmeticDTO1 = new CosmeticDTO("Maybline", 300, 2, CosmeticType.COMPACT, CosmeticShade.PINK);
		List<CosmeticDTO> list=new ArrayList<CosmeticDTO>();
		CosmeticDAO cosmeticDAO = new CosmeticDAOImpl(list);
		cosmeticDAO.create(cosmeticDTO1);
		cosmeticDAO.totalSize();

		System.out.println("=======================================");

		CosmeticDTO cosmeticDTO2 = new CosmeticDTO("Lancome", 200, 4, CosmeticType.EYELENAGR, CosmeticShade.PLUM);
		cosmeticDAO.create(cosmeticDTO2);

		System.out.println("============================================");
		CosmeticDTO cosmeticDTO3 = new CosmeticDTO("Lancome", 200, 3, CosmeticType.EYELENAGR, CosmeticShade.PINK);
		cosmeticDAO.create(cosmeticDTO3);

		System.out.println("===============================================");

		cosmeticDAO.updatePriceAndQuantity(200, 1, "Lancome");

		System.out.println("=================================================");

		cosmeticDAO.updatePriceByBrandAndType(20, "Lancome", CosmeticType.EYELENAGR);

		System.out.println("*************************************************");
		cosmeticDAO.updateTypeByBrand("Lancome", CosmeticType.MASKAR);

		System.out.println("*************************************");

//		cosmeticDAO.deleteByBrand("Lancome");
//		cosmeticDAO.deleteAll();
//		System.out.println("+++++++++++++++++++++++");
//		
//		cosmeticDAO.deleteByBrand("Lancome");
//		
//		System.out.println("+++++++++++++++++++++++++++");
//		
//		cosmeticDAO.updateTypeByBrand("Lancome", CosmeticType.MASKAR);

		System.out.println("############################################");

		List<CosmeticDTO> getAll = cosmeticDAO.getAll();
		System.out.println("Getting:" + getAll);

		System.out.println("#####################");

		cosmeticDAO.totalSize();

	}

}
