package com.xworkz.moon;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.dto.MenuDTO.Type;
import com.xworkz.moon.service.Finder;
import com.xworkz.moon.service.FinderImpl;

public class FinderTester {

	public static void main(String[] args) {
		
		MenuDTO dto=new MenuDTO("Eggrice", 30, Type.NONVEG);
		MenuDTO dto2=new MenuDTO("Edli", 60, Type.VEG);
		Finder finder=new FinderImpl();
		finder.test(dto);

	}

}
