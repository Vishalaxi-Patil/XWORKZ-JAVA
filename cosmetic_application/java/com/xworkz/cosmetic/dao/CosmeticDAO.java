package com.xworkz.cosmetic.dao;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticDAO {
	
	boolean create(CosmeticDTO dto);
	
	boolean updatePriceAndQuantity(double price,int quantity,String brand);
	
	boolean updatePriceByBrandAndType(double price,String brand,CosmeticType type);
	
	boolean updateTypeByBrand(String brand,CosmeticType type);
	
	boolean deleteByBrand(String brand);
	
	void deleteAll();
	
	List<CosmeticDTO> getAll();
	
	int totalSize();

}
