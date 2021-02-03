package com.xworkz.cosmetic;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.impl.CosmeticDAOImpl;
import com.xworkz.cosmetic.service.CosmeticSerive;
import com.xworkz.cosmetic.service.CosmeticServiceImpl;

public class CosmeticServiceTester {

	
	public static void main(String[] args) {

		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("MAC");
		cosmeticDTO.setCosmeticShade(CosmeticShade.PINK);
		cosmeticDTO.setCosmeticType(CosmeticType.COMPACT);
		cosmeticDTO.setPrice(200);
		cosmeticDTO.setQuantity(20);
		List<CosmeticDTO> list=new ArrayList<CosmeticDTO>();
		CosmeticDAO cosmeticDAO=new CosmeticDAOImpl(list);
		CosmeticSerive cosmeticSerive = new CosmeticServiceImpl(cosmeticDAO);
		cosmeticSerive.validationAndSave(cosmeticDTO);
//		cosmeticSerive.totalSizeInService();
//		cosmeticSerive.deleteByBrand("MAC");
//		cosmeticSerive.totalSizeInService();
//		
//		System.out.println("*******************************");
//		CosmeticDTO cosmeticDTO2=new CosmeticDTO("Maybelline", 200, 1, CosmeticType.LIPSTICKS, CosmeticShade.PLUM);
//		//CosmeticDAO cosmeticDAO2=new CosmeticDAOImpl();
//		CosmeticSerive cosmeticSerive2=new CosmeticServiceImpl(cosmeticDAO);
//		cosmeticSerive2.validationAndSave(cosmeticDTO2);
//		cosmeticSerive2.totalSizeInService();

	}

}
