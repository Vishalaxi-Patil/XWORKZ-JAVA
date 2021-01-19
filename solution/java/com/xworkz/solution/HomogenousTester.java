package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HomogenousTester {

	public static void main(String[] args) {
		
		//String[] obj=new String[2];
		Object[] obj=new Object[4];
		obj[1]=21;
		obj[2]=34;
		obj[3]="Vishala";
		//obj[4]=new Thread();
		
		//Collection apps=new ArrayList();
		Collection<String> apps=new ArrayList();
		apps.add("instagram");
		apps.add("Telegram");
		apps.add("Whatspp");
		
		Iterator iterator=apps.iterator();
		int stringCount=0;
		while(iterator.hasNext()) {
			Object obj1=iterator.next();
			if(obj1 instanceof String) {
				System.out.println("String found");
				stringCount++;
				System.out.println("Total String count::"+stringCount);
			}
				
			
		}
		

	}

}
