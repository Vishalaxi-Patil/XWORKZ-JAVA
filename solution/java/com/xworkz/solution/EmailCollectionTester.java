package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmailCollectionTester {
	
	public static void main(String[] args) {
		
	 ArrayList<String> emails=new ArrayList<>();
	 emails.add("vishalaxi@gamil.com");
	 emails.add("vishala@gamil.com");
	 emails.add("vishalaxikp@gamil.com");
	 emails.add("shushma@gamil.com");
	 emails.add("aishu@gamil.com");
	 emails.add("vena@gamil.com");
	 emails.add("sahana@gamil.com");
	 emails.add("lakshmi@gamil.com");
	 emails.add("mahalakshmi@gamil.com");
	 emails.add("pushpa@gamil.com");
	 emails.add("omkar@gamil.com");
	 emails.add("jayashree@gamil.com");
	 emails.add("vidya@gamil.com");
	 emails.add("pavitra@gamil.com");
	 emails.add("mala@gamil.com");
	 emails.add("omkar@gamil.com");
	 emails.add("vidya@gamil.com");
	 emails.add("omkar@gamil.com");
	 emails.add("vishalaxi@gamil.com");
	 emails.add("vishalaxi@gamil.com");
	 System.out.println("list with duplicate ::"+emails);
	 int total=emails.size();
	 System.out.println("Total elements before:"+total);
	 
	 Set<String> set=new LinkedHashSet<String>(emails);
	 
	 emails.clear();
	 emails.addAll(set);
	 System.out.println("List Without duplicate:"+emails);
	 total=emails.size();
	 System.out.println("Total elements after:"+total);
	 
	 /*Iterator iterator=emails.iterator();
	 int count=0;
	 while(iterator.hasNext()) {
		 Object obj=iterator.next();
		 if(set.add(emails)==false) {
		 System.out.println(obj);
		 }
		 count++;
		 System.out.println(count);
	 }*/
	 
	 
	 
	
	 
	 
	 
		
	}

}
