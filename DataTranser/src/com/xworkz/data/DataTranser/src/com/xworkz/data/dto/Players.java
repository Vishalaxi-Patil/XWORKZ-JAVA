package com.xworkz.data.dto;

import java.util.Arrays;

public class Players {
	private String name;
	private String countryName;
	private String[] awards;
	private String[] sports;

	public Players(String name,String countryName,String[] awards,String[] sports)
	{
		System.out.println("called parameterized contructor player");
		this.name=name;
		this.countryName=countryName;
		this.awards=awards;
		this.sports=sports;
		System.out.println("name of the sports person::"+name);
		System.out.println("country name of the sports person::"+countryName);
		System.out.println("Awards name::"+Arrays.toString(awards));
		System.out.println("Sports name::"+Arrays.toString(sports));
		System.out.println("Exit Player Constrcutor");
	}
		
	
	public String getName() {
		return name;
	}
	public String getCountryName() {
		return countryName;
	}
	public String[] getAwards(String[] awards) {
		this.awards=awards;
		return awards;
		
	}
	public String[] getSports() {
		return sports;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public void setAwards(String[] awards) {
		this.awards = awards;
	}
	public void setSports(String[] sports) {
		this.sports = sports;
	}

}
