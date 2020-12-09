package com.xworkz.data;
import com.xworkz.data.dto.Players;

public class PlayersTester {
	public static void main(String[] args) {
		
	String[] awards= {"Rajiv Gandi khel Ratna","Dronacharya","Arjuna","Dhyan Chand Award"};
	String[] sports= {"Cricket","Tennis","Boxing","Hockey"};
	Players players=new Players("Rohit Sharma", "India", awards, sports);
	System.out.println(players.getName());
	System.out.println(players.getCountryName());
	//System.out.println(players.getAwards());
	//System.out.println(players.getSports());
	players.setName("Ms.Rani");
	System.out.println("name after usimg set method::"+players.getName());
	players.setCountryName("India");
	System.out.println("country name using set method::"+players.getCountryName());
	players.setAwards(awards);
	System.out.println("name of awards after using set method::"+players.getAwards(awards));
	players.setSports(sports);
	System.out.println("name of sports after using set method::"+players.getSports());
	
	
	
	
	
	
	
	
    
}
}
