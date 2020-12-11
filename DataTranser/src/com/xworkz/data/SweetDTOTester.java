package com.xworkz.data;

import com.xworkz.data.dto.SweetDTO;
import com.xworkz.data.constants.Colorss;

import java.util.Arrays;

import com.xworkz.data.constants.Colorss;
import com.xworkz.data.constants.Shape;

public class SweetDTOTester {
	public static void main(String[] args) {
		
	SweetDTO sweetDto = new SweetDTO();
	//print default value using deafault constructor
	System.out.println(sweetDto.getName());
	System.out.println(sweetDto.getPopularState());
	System.out.println("*************************************************");
	SweetDTO sweetDto2=new SweetDTO("Laddu", 450,"tirupati");
	System.out.println(sweetDto2.getName());
	System.out.println(sweetDto2.getPrice());
	System.out.println(sweetDto2.getPopularState());
     String[] color= new String[3];
     color[0]="White";
	SweetDTO sweetDto3=new SweetDTO(color, Shape.CYLINDRICLE);
	System.out.println(sweetDto3.getColor());
	System.out.println(sweetDto3.getShape());
	//give different reference variable to change value of the array
	String[] colors= {"Red","White","Chocklate"};
	System.out.println(("*********************************************"));
	SweetDTO sweetDto4=new SweetDTO(colors, Shape.CYLINDRICLE);
	System.out.println(sweetDto4.getShape());
	System.out.println(Arrays.toString(sweetDto4.getColor()));
	Colorss[] colorss=new Colorss[3];
	//error
	colorss[0]=BLACK;
	SweetDTO sweetDTO5=new SweetDTO(colorss.BLACK,Shape.CYLINDRICLE);
	
	
			
	
	
	
	}
}
