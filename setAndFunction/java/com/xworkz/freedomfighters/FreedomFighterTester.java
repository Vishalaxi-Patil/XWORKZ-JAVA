package com.xworkz.freedomfighters;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.freedomfighters.dto.FreedomFightersDTO;
import com.xworkz.freedomfighters.dto.FreedomFightersDTO.Gender;

public class FreedomFighterTester {

	public static void main(String[] args) {

		FreedomFightersDTO dto1 = new FreedomFightersDTO("Bhagat Singh", "India", Gender.MALE);
		FreedomFightersDTO dto2 = new FreedomFightersDTO("KRC", "India", Gender.FEMALE);
		FreedomFightersDTO dto3 = new FreedomFightersDTO("OO", "India", Gender.FEMALE);

		FreedomFightersDTO dto4 = new FreedomFightersDTO("SCB", "India", Gender.MALE);

		FreedomFightersDTO dto5 = new FreedomFightersDTO("OO", "India", Gender.FEMALE);
		
		Set<FreedomFightersDTO> set=new HashSet<FreedomFightersDTO>();
		set.add(dto1);
		set.add(dto2);
		set.add(dto3);
		set.add(dto4);
		set.add(dto5);
		
		System.out.println(set.size());
		set.forEach(f->System.out.println(f));//for each using lambda
	}

}
