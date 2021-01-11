package com.xworkz.palace;

import com.xworkz.dto.PalaceDTO;

public class PalaceTester {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	PalaceDTO dto=new PalaceDTO("Gadag","Kallanagouda", "Vishalaxi");
	System.out.println("Palace Location:"+dto.getLocation());
	System.out.println("King for my life:"+dto.getKingName());
	System.out.println(dto.getQueenName()+" is a queen for "+dto.getKingName());
	
	PalaceDTO dto2=new PalaceDTO("Gadag", "Amogh", "Apeksha");
	System.out.println("Palace Location:"+dto2.getLocation());
	System.out.println("King for my life:"+dto2.getKingName());
	System.out.println(dto2.getQueenName()+" is a queen for "+dto2.getKingName());
	
	int hash=dto2.hashCode();
	System.out.println(hash);
	boolean equal=dto.equals(dto2);
	System.out.println(equal);
	String toString=dto2.toString();
	System.out.println(toString);
	
	PalaceDTO copy1=dto2.clone();
	System.out.println(copy1.getLocation());
	System.out.println(copy1.getKingName());
	System.out.println(copy1.getQueenName());
	
	PalaceDTO copy2=dto2.clone();
	System.out.println(copy2.getLocation());
	System.out.println(copy2.getKingName());
	System.out.println(copy2.getQueenName());
	
	
	PalaceDTO dto3=new PalaceDTO();
	System.out.println(dto3.getLocation());
	
	
	
	
	}

}
