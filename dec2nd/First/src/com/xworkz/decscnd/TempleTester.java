package com.xworkz.decscnd;
import com.xworkz.decscnd.intialization.Temple;


public class TempleTester {

	public static void main(String[] args) {
	Temple temple;
	temple=new Temple("sai baba","Gadag",6.0f,"laadu",9.0f);
     System.out.println(temple.getName("sai baba"));
     System.out.println(temple.getLocation("hubli"));
     //System.out.println(temple.getstartTime(6.0f) +"AM");
     System.out.println(temple.getPrasada("laadu"));
     //System.out.println(temple.getCloseTime(8.0f) +"PM");
      temple.setLocation("Ganesh");
	}
}


