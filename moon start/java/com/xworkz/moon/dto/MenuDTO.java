package com.xworkz.moon.dto;

public class MenuDTO {
	
	private String itemName;
	private int price;
	private Type type;
	
	public enum Type{
		VEG,NONVEG;
	}
	
	public MenuDTO() {
		System.out.println("Default constructor");
	}
	
	

	public MenuDTO(String itemName, int price, Type type) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.type = type;
	}



	@Override
	public String toString() {
		return "MenuDTO [itemName=" + itemName + ", price=" + price + ", type=" + type + "]";
	}



	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	

}
