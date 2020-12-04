package com.xworkz.constructor;
import com.xworkz.constructor.decfrst.Aquarium;


public class AquariumTester {

	public static void main(String[] args) {
		new Aquarium("ColdWater");
		new Aquarium("Marine");
		new Aquarium("Marine","fish");
		new Aquarium("Freshwater","Fish",70);
		new Aquarium("Brackish","fish",30,"small");
		new Aquarium("Fish",70);
		
		
	}

}
