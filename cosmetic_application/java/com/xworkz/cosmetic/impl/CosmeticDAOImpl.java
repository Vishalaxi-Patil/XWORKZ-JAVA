package com.xworkz.cosmetic.impl;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	// private List<CosmeticDTO> cosmetics;
	//private List<CosmeticDTO> cosmetics = new ArrayList<CosmeticDTO>();improve
	private List<CosmeticDTO> cosmetics;
	
	public CosmeticDAOImpl(List<CosmeticDTO> list) {
		System.out.println("Invoked CosmeticDAOImpl");
		this.cosmetics=list;
	}

	// public CosmeticDAOImpl() {
	// this.cosmetics = new ArrayList<CosmeticDTO>();// creating implimentation of
	// interface
	// }

	@Override
	public boolean create(CosmeticDTO dto) {

		boolean created = false;
		boolean contains = this.cosmetics.contains(dto);
		if (!contains) {
			System.out.println("Invoked create");
			System.out.println(
					"dto is added beacuse this dto which constains brand name and cosmeticType are not therebefore:"
							+ dto);
			created = this.cosmetics.add(dto);
			System.out.println("added");
		} else {
			System.out.println(
					"dto is not added beacuse this dto which constains brand name and cosmeticType is already there:"
							+ dto);
		}
		if (created) {
			System.out.println("cosmetics is saved");
			return true;

		} else {
			System.out.println("cosmetics is not saved");
		}
		return false;

	}

	@Override
	public boolean updatePriceAndQuantity(double newPrice, int newQuantity, String brand) {
		System.out.println("updatePriceAndQuantity");
		System.out.println("updating price:" + newPrice + " and quantity:" + newQuantity + " by brand:" + brand);
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			// System.out.println("entered for each");
			String brandTested = cosmeticDTO.getBrand();
			System.out.println("brandTested " + brandTested);
			if (brandTested != null && brandTested.equals(brand)) {
				System.out.println("brand found can update price and quantity");
				cosmeticDTO.setPrice(newPrice);
				cosmeticDTO.setQuantity(newQuantity);
				System.out.println("updated price and quantity " + cosmeticDTO);
				return true;
			} else {
				System.out.println("brand is not found");
			}
		}

		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		System.out.println("updatePriceByBrandAndType");
		System.out.println("updating price:" + price + " by brand:" + brand + " and type" + type);
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			System.out.println("entered for each");
			String brandTested = cosmeticDTO.getBrand();
			CosmeticType typeTested = cosmeticDTO.getCosmeticType();
			System.out.println("brandTested " + brandTested);
			System.out.println("typeTested:" + typeTested);
			if (brandTested != null && typeTested != null && brandTested.equals(brand) && typeTested.equals(type)) {
				System.out.println("brand and type found can update price");
				cosmeticDTO.setPrice(price);
				System.out.println("updated price " + cosmeticDTO);
				return true;
			} else {
				System.out.println("brand and type is not found");
			}
		}

		return false;
	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {
		System.out.println("updateTypeByBrand");
		System.out.println("updating type:" + type + " by brand:" + brand);
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			System.out.println("entered for each");
			String brandTested = cosmeticDTO.getBrand();
			System.out.println("brandTested " + brandTested);
			if (brandTested != null && brandTested.equals(brand)) {
				System.out.println("brand found can update type");
				cosmeticDTO.setCosmeticType(type);
				System.out.println("updated type " + cosmeticDTO);
				return true;
			} else {
				System.out.println("brand is not found");
			}
		}

		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		System.out.println("deleteByBrand");
		System.out.println("deleting brand:" + brand);
		Iterator<CosmeticDTO> iterator = cosmetics.iterator();
		while (iterator.hasNext()) {
			CosmeticDTO next = iterator.next();
			System.out.println("next:" + next);
			String getBrand = next.getBrand();
			System.out.println("getBrand:" + getBrand);
			if (getBrand.equals(brand)) {
				System.out.println("brand is found so deleted");
				iterator.remove();
			} else {
				System.out.println("brand name not found");
			}
		}
		return false;
	}

	@Override
//	public void deleteAll() {
//		System.out.println("deleteAll");
//		Iterator<CosmeticDTO> iterator = cosmetics.iterator();
//		while (iterator.hasNext()) {
//			CosmeticDTO next = iterator.next();
//			System.out.println("next:" + next);
//			iterator.remove();
//		}
//
//	}
	public void deleteAll(){
	this.cosmetics.clear();
    }
	
	
	@Override
	public List<CosmeticDTO> getAll() {
//		System.out.println("invoked getAll");
//		for (CosmeticDTO cosmeticDTO : cosmetics) {
//			System.out.println("getAll");
//
//		}
	return this.cosmetics;
	}
	//or
	//public List<CosmeticDTO> getAll(){
	//return cosmetics;

	@Override
	public int totalSize() {
		System.out.println("totalSize in CosmeticDAOImpl");
//		int size = cosmetics.size();
//		System.out.println("total size in CosmeticDAOImpl:" + size);
		return this.cosmetics.size();
	}

}
