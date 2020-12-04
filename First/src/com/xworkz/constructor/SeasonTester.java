package com.xworkz.constructor;
import com.xworkz.constructor.decfrst.Season;

public class SeasonTester {

	public static void main(String[] args) {
		new Season();
		Season ses=new Season("Winter","dec");
		String seasonName=ses.name;
		System.out.println("name of the season::"+seasonName);
		String seasonMonth=ses.startMonth;
		System.out.println("Starting month::" +seasonMonth);
		
	}

}
