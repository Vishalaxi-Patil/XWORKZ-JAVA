package com.xworkz.carshowroom.dto;
import com.xworkz.carshowroom.constants.Varients;

public class CarDTO {
	private String name;
	private double price;
	private Varients varients;
	
	public CarDTO() {
		System.out.println("CarDTO called as default constructor");
	}
	public CarDTO(String name,double price,Varients varients)
	{
		System.out.println("CarDTO constructor is called with 2 parameter");
		this.name=name;
		this.price=price;
		this.varients=varients;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Varients getVarients() {
		return varients;
	}
	public void setVarients(Varients varients) {
		this.varients = varients;
	}
	
	

}
