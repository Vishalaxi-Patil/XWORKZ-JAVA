package com.xworkz.backery;

import com.xworkz.Browser.Browser;


public class BrowserTester {

	public static void main(String[] args) {
		// Object is the parent for all classes
		// Browser is the child class for the object
		Object obj = new Object();
		Object obj1 = new Browser();
		// methods of object
		obj.equals(obj);
		obj.getClass();
		obj.hashCode();
		//obj.notify();
		//obj.notifyAll();
		obj.toString();
		// obj.wait();
		// obj.wait(0l);
		// obj.wait(0l, 0);
		// Parent of the String is object
		Object day = new String();
		Object generic = new com.xworkz.backery.cake.Cake();// called inline import which avoids the confusion between
															// same class name
		// by using parent i,e object ,we can create child i,e bowser
		Object object = new Browser();// object.() which only includes method of the obejct
		Browser browser = new Browser();// browser.() which includes object methods and browser methods
		System.out.println(browser.getName());
		browser.setName("Google");
		System.out.println(browser.getName());
		Browser childRef = (Browser) object;// converting parent class i,e object to a child class i,e Browser ,this
											// process is called as type casting
		Object day1 = new String("Tuesday");
		String childRef1 = (String)day1; // converting parent class i,e object to a child class i,e String
        Browser notGoodRef=(Browser)day1;//Exception error i,e java.lang.ClassCastException beacuse both are child class
        
        
        
        
	}

}
