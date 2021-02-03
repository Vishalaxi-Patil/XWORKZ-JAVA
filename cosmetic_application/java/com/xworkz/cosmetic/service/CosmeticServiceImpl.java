package com.xworkz.cosmetic.service;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.impl.CosmeticDAOImpl;

public class CosmeticServiceImpl implements CosmeticSerive {
	
	private CosmeticDAO cosmeticDAO;

	public CosmeticServiceImpl(CosmeticDAO cosmeticDAO) {
		System.out.println("Invoked CosmeticServiceImpl");
		this.cosmeticDAO=cosmeticDAO;
		
	}

	@Override
	public boolean validationAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData = false;
		if (cosmeticDTO != null) {
			System.out.println("cosmeticDTO is not null so validate the fields");
			String brand = cosmeticDTO.getBrand();

			if (brand != null && brand.length() >= 3 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is invalid");
				validData = false;
			}

			if (validData) {
				double price = cosmeticDTO.getPrice();
				if (price > 0) {
					System.out.println("price is valid");
					validData = true;
				} else {
					System.out.println("price is invalid");
					validData = false;
				}
			}
			if (validData) {
				int quantity = cosmeticDTO.getQuantity();
				if (quantity > 0 && quantity <= 100) {
					System.out.println("quantity is valid");
					validData = true;
				} else {
					System.out.println("quantity is invalid");
					validData = false;
				}
			}
			if (validData) {
				CosmeticType cosmeticType = cosmeticDTO.getCosmeticType();
				if (cosmeticType != null) {
					System.out.println("cosmeticType is valid");
					validData = true;
				} else {
					System.out.println("cosmeticType is invalid");
					validData = false;
				}
			}
			if (validData) {
				CosmeticShade cosmeticShape = cosmeticDTO.getCosmeticShade();
				if (cosmeticShape != null) {
					System.out.println("cosmeticType is valid");
					validData = true;
				} else {
					System.out.println("cosmeticType is invalid");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("All data is valid so save to dao");
				//CosmeticDAO cosmeticDAO = new CosmeticDAOImpl(); make improve
				cosmeticDAO.create(cosmeticDTO);
				return true;
			}
		} else {
			System.out.println("dto is null,cannot add fields");
		}
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		System.out.println("Invoked deleteByBrand from CosmeticServiceImpl");
		if(brand!=null && !brand.isEmpty() && !brand.contains(" ") && brand.length()>=3) {
			System.out.println("brand is valid in deleteByBrand so delete brand");
			this.cosmeticDAO.deleteByBrand(brand);
			return true;
		}else {
			System.out.println("brand is not valid in deleteByBrand");
			//return false;
		}
		
		return false;
	}

	@Override
	public int totalSizeInService() {
		System.out.println("Invoked total Size by CosmeticServiceImpl");
		int size=cosmeticDAO.totalSize();
		System.out.println("total size in CosmeticServiceImpl:"+size);
		return size;
		
	}
}
