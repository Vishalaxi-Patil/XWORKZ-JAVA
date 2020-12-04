package com.xworkz.decscnd.intialization;

public class Paper {
	private String brand="classmate";
	private int width;
	private int height;
	private String color;

	public Paper(String brand, int width, int height, String color) {
		System.out.println("Paper constructor is called");
		this.brand = brand;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private void setBrand(String brand) {
		this.brand = brand;
		
	}
	void setWidth(int width) {
		this.width = width;
	}
    void setHeight(int height) {
		this.height = height;
	}

	

}