package com.xworkz.moon;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.service.Finder;
import com.xworkz.moon.service.FinderImpl;
import com.xworkz.moon.service.RestrauntServiceImpl;
import com.xworkz.moon.service.RestruantService;
import com.xworkz.moon.service.VegFinderImpl;

public class RestrauntTester {
	public static void main(String[] args) {
		
		RestruantService service=new RestrauntServiceImpl();
		service.displayItemGraterThan(20);
		service.displayByName("EggRice");
		Finder finder=new FinderImpl();
		//service.findAndDisplay(finder);
		//Or
		service.findAndDisplay(new Finder() {
			
			//Functional interface
			@Override
			public boolean test(MenuDTO dto) {
				  if(dto.getPrice()>=50) {
					  return true;
				  }
				return false;
			}
		});
		
		//(ref)->{}; lamda expression
				//() is required if you have more than one param
				//more than one statement
		
		service.findAndDisplay(d->d.getPrice()>=60);
		
		//service.findAndDisplay(finder);
		Finder finder2=new VegFinderImpl();
		service.findAndDisplay(finder2);
		
	   
	}

}
