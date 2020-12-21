package com.xworkz.backery.cake;

public class Cake {
	private String flavaour;
	private double size;
	private String shape;
	
	public void baking()
	{
		System.out.println("Invoked backing");
	}
	
	public String getFlavaour()
	{
		return flavaour;
	}
	public void setFlavaour(String flavaour)
	{
		this.flavaour=flavaour;
	}
	public double getSize()
	{
		return size;
	}
	public void setSize(double size)
	{
		this.size=size;
	}
	public String getShape()
	{
		return shape;
	}
	public void setShape(String shape)
	{
		this.shape=shape;
	}

}
