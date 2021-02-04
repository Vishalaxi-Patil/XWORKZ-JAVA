package com.xworkz.moon.service;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.dto.MenuDTO.Type;

public class RestrauntServiceImpl implements RestruantService{
	
	List<MenuDTO> dtos;
	
	public RestrauntServiceImpl() {
		this.dtos=new LinkedList<MenuDTO>();
		MenuDTO  menuDTO1=new MenuDTO("EggRice", 30, Type.NONVEG);
		MenuDTO menuDTO2=new MenuDTO("Friderice", 50, Type.VEG);
		MenuDTO menuDTO3=new MenuDTO("EggKurma", 80, Type.NONVEG);
		MenuDTO menuDTO4=new MenuDTO("Rotti", 40, Type.VEG);
		MenuDTO menuDTO5=new MenuDTO("Parota", 60, Type.VEG);
		
		this.dtos.add(menuDTO1);
		this.dtos.add(menuDTO2);
		this.dtos.add(menuDTO3);
		this.dtos.add(menuDTO4);
		this.dtos.add(menuDTO5);
	}

	@Override
	public void displayItemGraterThan(int price) {
		System.out.println("Inoked displayItemGraterThan");
		for (MenuDTO menuDTO : dtos) {
			if(menuDTO.getPrice()>=price) {
				System.out.println(menuDTO);
			}
		}
		
	}
	

	@Override
	public void displayByName(String name) {
		System.out.println("Invoked displayByName");
		for (MenuDTO menuDTO : dtos) {
			if(menuDTO.getItemName().equals(name)) {
				System.out.println(menuDTO);
			}
		}
		
	}

	@Override
	public void findAndDisplay(Finder finder) {
		System.out.println("Invoked findAndDisplay");
		for (MenuDTO menuDTO : dtos) {
			if(finder.test(menuDTO)) {
				System.out.println(menuDTO);
			}
		}
		
	}

}
