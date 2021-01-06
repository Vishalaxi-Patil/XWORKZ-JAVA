package com.xworkz.mutipleinheritance;

//import com.xworkz.mutipleinheritance.diamondproblemsolved.Contract;
import com.xworkz.mutipleinheritance.diamondproblemsolved.RedBusContract;
//import com.xworkz.mutipleinheritance.diamondproblemsolved.Security;
import com.xworkz.mutipleinheritance.impl.RedBusImp;

public class MultiTester {
	public static void main(String[] args) {
		
		RedBusContract contract=new RedBusImp();
		contract.close();
		contract.open();
		contract.maxBooking();
		Object object=new RedBusImp();
		RedBusImp cast=(RedBusImp)object;
		System.out.println("**************************");
		cast.close();
		cast.open();
		cast.maxBooking();
		
		
		
	}
	
	
	
	
	

}
