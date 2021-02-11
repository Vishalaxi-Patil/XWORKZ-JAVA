package com.xworkz.freedomfighters.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedomfighters.functional.Display;

public class DisplayServiceImpl implements DisplaySerivce{
	
	
	List<String> names;
	
	public DisplayServiceImpl() {
		
		this.names=new ArrayList<String>();
		this.names.add("Steve Jobs");
		this.names.add("Games Gosling");
		this.names.add("Modi");
		this.names.add("Kalam");
		this.names.add("obava");
	}
	
	

	@Override
	public void printString(Display display) {
		for (String string : names) {
			
			display.print(string," Indian");
			
		}
		
		
		
		
	}
	
	

}
