package com.xworkz.optional.dto;

import java.util.Optional;

public class GiftDTO {
	
	private Optional<GiftType> giftType;
	private Optional<String> givenBy;
	private double price;
	
	
	public enum GiftType{
		CHOCHLATE,WATCH,RING,MUG,EARINGS,DOLL,SHOES
	}


	

	@Override
	public String toString() {
		return "GiftDTO [giftType=" + giftType + ", givenBy=" + givenBy + ", price=" + price + "]";
	}


	public Optional<GiftType> getGiftType() {
		return giftType;
	}


	public void setGiftType(Optional<GiftType> giftType) {
		this.giftType = giftType;
	}


	public Optional<String> getGivenBy() {
		return givenBy;
	}


	public void setGivenBy(Optional<String> givenBy) {
		this.givenBy = givenBy;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
