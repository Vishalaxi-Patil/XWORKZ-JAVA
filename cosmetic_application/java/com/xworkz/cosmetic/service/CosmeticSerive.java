package com.xworkz.cosmetic.service;

import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticSerive {
	
	boolean validationAndSave(CosmeticDTO cosmeticDTO);
	
	boolean deleteByBrand(String brand);
	
	int totalSizeInService();
	
	

}
