package com.xworkz.cosmetic.dto;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;

public class CosmeticDTO {

	private String brand;
	private double price;
	private int quantity;
	private CosmeticType cosmeticType;
	private CosmeticShade cosmeticShade;

	public CosmeticDTO() {
		System.out.println("Invoked CosmeticDTO");
	}

	public CosmeticDTO(String brand, double price, int quantity, CosmeticType cosmeticType,
			CosmeticShade cosmeticShade) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.cosmeticType = cosmeticType;
		this.cosmeticShade = cosmeticShade;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("overide equals");
		if (obj == null) 
			return false;
		
			if (obj instanceof CosmeticDTO) {
				CosmeticDTO cast = (CosmeticDTO) obj;
				if (cast.getBrand() != null && cast.getCosmeticType() != null && cast.getBrand().equals(this.brand)
						&& cast.getCosmeticType().equals(this.cosmeticType)) {
					System.out.println("barnd and cosmeticType are equal");
					return true;
				} else {
					System.out.println("barnd and cosmeticType are not equal");
					return false;

				}
			

		}
			return false;

	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", price=" + price + ", quantity=" + quantity + ", cosmeticType="
				+ cosmeticType + ", cosmeticShade=" + cosmeticShade + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public CosmeticType getCosmeticType() {
		return cosmeticType;
	}

	public void setCosmeticType(CosmeticType cosmeticType) {
		this.cosmeticType = cosmeticType;
	}

	public CosmeticShade getCosmeticShade() {
		return cosmeticShade;
	}

	public void setCosmeticShade(CosmeticShade cosmeticShade) {
		this.cosmeticShade = cosmeticShade;
	}

}
