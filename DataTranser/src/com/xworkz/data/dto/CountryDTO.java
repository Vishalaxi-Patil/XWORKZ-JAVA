package com.xworkz.data.dto;

public class CountryDTO {
	private String name;
	private String continent="Asia";
	private String[] states;
	private long population;
	private String primeMinister;
	private String president;
	private String[] languages;
	
	public CountryDTO()
	{
		System.out.println("Default constrcutor");
	}
	public CountryDTO(String name)
	{
		System.out.println("CountryDTO constructor called with one parameter");
		this.name=name;
	}
	public CountryDTO(String name,String[] states)
	{
		System.out.println("CountryDTO constructor called with two parameter");
		this.name=name;
		this.states=states;
	}
	public CountryDTO(long population,String primeMinister,String president )
	{
		System.out.println("CountryDTO constructor called with three parameter");
	this.population=population;
	this.primeMinister=primeMinister;
	this.president=president;
	}
	public CountryDTO(String name,String[] states,long population,String primeMinister,String president,String[] languages)
	{
		System.out.println("CountryDTO constructor called with 6 parameter");
		this.name=name;
		this.states=states;
		this.population=population;
		this.primeMinister=primeMinister;
		this.president=president;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getStates() {
		return states;
	}
	public void setStates(String[] states) {
		this.states = states;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	public String getContinent() {
		return continent;
	}
	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}
	
	
	
	
	
	
	

}
