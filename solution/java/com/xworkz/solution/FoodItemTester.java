package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FoodItemTester {
	
	public static void main(String[] args) {
		
		Collection foods=new ArrayList();
		foods.add("Dosa");
		foods.add("Eggrice");
		foods.add("Puri");
		foods.add(22);
		foods.add(1);
		
		Iterator iterator=foods.iterator();
		int count=0;
		while(iterator.hasNext()) {
			Object obj=iterator.next();
			if(obj instanceof String) {
				System.out.println("String found");
				count++;
				System.out.println(count);
			}
		}
		
		Iterator iterator1=foods.iterator();
		int count1=0;
		while(iterator1.hasNext()) {
			Object obj=iterator1.next();
			if(obj instanceof Integer) {
				System.out.println("Integer found");
				count1++;
				System.out.println(count1);
			}
		}
		
	
	

}
}
