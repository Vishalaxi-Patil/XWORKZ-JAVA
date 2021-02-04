package com.xworkz.moon.service;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.dto.MenuDTO.Type;

public class FinderImpl implements Finder {

	@Override
	public boolean test(MenuDTO dto) {
		//System.out.println("Invoked test");
		if(dto.getType().equals(Type.NONVEG)) {
			//System.out.println(dto);
			return true;
		}
		return false;
	}

}
