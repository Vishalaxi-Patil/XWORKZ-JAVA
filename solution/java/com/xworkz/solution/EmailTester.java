package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmailTester {
	public static void main(String[] args) {
		
		Collection<String> emails=new ArrayList();
		emails.add("vishalaxi@gmail.com");
		emails.add("shushma@gmail.com");
		emails.add("aishu@gmail.com");
		emails.add("vena@gmail.com");
		emails.add("shushma@gmail.com");
		emails.add("shushma@gmail.com");
		System.out.println("List of all emails::"+emails);
		int total=emails.size();
		System.out.println("Total elemets::"+total);
		
		Collection<String> temp=new ArrayList<String>();
		Iterator<String> iterator=emails.iterator();
		while(iterator.hasNext()) {
			String str=iterator.next();
			System.out.println("String emails::"+str);
			if(temp.contains(str)) {
				System.out.println("duplicate Email Id::"+str);
			}else {
				System.out.println("added temp:"+str);
				temp.add(str);
				}
		}
			
		System.out.println("temp email id size::"+temp.size());
		emails.clear();
		
		
		
		
		Iterator<String> tempEmail=emails.iterator();
		while(tempEmail.hasNext()) {
			emails.add(tempEmail.next());
		}
		System.out.println("Size of email id ::"+emails.size());
		
			
		}
		
	
	

}
