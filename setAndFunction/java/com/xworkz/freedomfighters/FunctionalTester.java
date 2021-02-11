package com.xworkz.freedomfighters;

import com.xworkz.freedomfighters.service.DisplaySerivce;
import com.xworkz.freedomfighters.service.DisplayServiceImpl;

public class FunctionalTester {

	public static void main(String[] args) {
		
	  DisplaySerivce service=new DisplayServiceImpl();
	  service.printString((l,t)->{
			//System.out.println("validating"+l + " t"+t);
			if(l.contains("a") || l.contains("A"))
			{
				System.out.println(l+ " "+l.hashCode());
			}
		});
		

	}

}
