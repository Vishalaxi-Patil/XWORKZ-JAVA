package com.xworkz.Zoo;

import com.xworkz.dto.ZooDTO;

public class ZooTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		ZooDTO dto=new ZooDTO("Benergatta", true);
		ZooDTO copy=dto.clone();
		System.out.println(copy.getName()+" "+copy.isSafari());
		
		
		
	}

}
