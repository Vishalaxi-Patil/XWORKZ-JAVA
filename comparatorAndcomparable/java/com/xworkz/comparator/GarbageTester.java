package com.xworkz.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GarbageTester {

	public static void main(String[] args) {
		
		
		List<String> listOfTools=new ArrayList<String>();
		listOfTools.add("Hammer");
		listOfTools.add("Spanner");
		listOfTools.add("Bolt");
		listOfTools.add("nuts");
		listOfTools.add("air pump");
		
		for (String string : listOfTools) {
			System.out.println("String before soring:"+string);
			
		}
		
		//GarbageComparator comparator=new GarbageComparator();
		Collections.sort(listOfTools);
		
		
		System.out.println("**************************");
		for (String string : listOfTools) {
			System.out.println("String After sorting:"+string);
		}

	}

}
