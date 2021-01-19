package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTester {

	public static void main(String[] args) {
		
		/*collection is a framework
		problems of Array
		fixed sixe,not dynamic, no methods to manipulate,no alogo*/
		
		String cadbury = "eclairs";
		String nestle = "Kitkat";
		String campco = "MilkyBar";
		String parle = "Kiss me";
		String amul = "Dark Chocolate";
		
		Collection chocklates=new ArrayList();
	    boolean added=chocklates.add(amul);
		//boolean added=chocklates.add(null); return true
		System.out.println("added:"+added);
		
		Collection collection=null;
		//Collection collection=new ArrayList();
		boolean add=false;
		add=chocklates.add(nestle);
		System.out.println(add);
		add=chocklates.add(parle);
		System.out.println(add);
		add=chocklates.add(amul);
		System.out.println(add);
		add=chocklates.add(cadbury);
		System.out.println(add);
		
		int totalElemts=chocklates.size();
		System.out.println(totalElemts);
		
		String hershey="Kisses";
		boolean remove=chocklates.remove(hershey);
		System.out.println("Removed::"+remove);
		
		add=chocklates.add(null);
		System.out.println(add);
		
	     totalElemts=chocklates.size();
		System.out.println(totalElemts);
		
		add=chocklates.add(parle);
		System.out.println(add);
		totalElemts=chocklates.size();
		System.out.println("total elements after adding duplicates::"+totalElemts);
		
		System.out.println("Looping chcolates using for loop*********");
		
		Object[] chocklatesConverted=chocklates.toArray();
		for(int i=0;i<chocklatesConverted.length;i++) {
			System.out.println(chocklatesConverted[i]);
		}
		
		System.out.println("Looping chocklates using iterator");
		
		Iterator iterator=chocklates.iterator();//abstraction
		//methods of iterator hashNext(),next(),remove()
		
		//chocklates.clear();
		while(iterator.hasNext()) {
			Object str=iterator.next();
			System.out.println(str);
			
		}
		
		 boolean contarins=chocklates.contains(amul);
		 System.out.println(contarins);
		 System.out.println("**************");
		 chocklates.clear();
		 boolean empty=chocklates.isEmpty();
		 System.out.println(empty);
		
		
		
		
		
		
	}

}
