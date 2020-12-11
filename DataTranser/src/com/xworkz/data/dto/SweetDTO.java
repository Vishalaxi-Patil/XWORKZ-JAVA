package com.xworkz.data.dto;

import com.xworkz.data.constants.Colorss;
import com.xworkz.data.constants.Shape;


public class SweetDTO {
	private String name;
	private int price;
	private String popularState;
	@Deprecated
	private String[] color;
	private Shape shape;
	private Colorss colorss;
	
	public Colorss getColorss() {
		return colorss;
	}
	public void setColorss(Colorss colorss) {
		this.colorss = colorss;
	}
	public SweetDTO()
	{
		System.out.println("Default construtor");
	}
	public SweetDTO(String name,int price,String popularState)
	{
		System.out.println("Sweet DTO constrcutor is called with 3 parameter");
		this.name=name;
		this.price=price;
		this.popularState=popularState;
		
	}
	public SweetDTO(String[] color,Shape shape)
	{
		System.out.println("Sweet DTO constructor is called with 3 parameter");
		//this.name=name;
		this.color=color;
		this.shape=shape;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPopularState() {
		return popularState;
	}
	public void setPopularState(String popularState) {
		this.popularState = popularState;
	}
	@Deprecated
	public String[] getColor() {
		return color;
	}
	@Deprecated
	public void setColor(String[] color) {
		this.color = color;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	
	
	
}

