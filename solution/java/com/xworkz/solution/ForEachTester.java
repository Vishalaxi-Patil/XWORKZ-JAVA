package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ForEachTester {
	public static void main(String[] args) {
		
		Collection<String> names=new ArrayList<String>();
		names.add("Omkareshwar");
		names.add("Vinay");
		names.add("Nikunj");
		names.add("Devendra");
		
		//syntax for forEach for(type ref:collection)
		
		for(String name:names) {
			//names.remove(name);  cuncurrentModificationException
			System.out.println("cannot remove parelly");
			
		}
		System.out.println("size of list before removing vinay::"+names.size());
		
		Iterator<String> iterator=names.iterator();
		while(iterator.hasNext()) {
			String name=iterator.next();
			System.out.println(name);
			if(name.equals("Vinay")) {
				iterator.remove();
			}
		}
		System.out.println(names);
		System.out.println("size of list after removing vinay::"+names.size());
	}

}
