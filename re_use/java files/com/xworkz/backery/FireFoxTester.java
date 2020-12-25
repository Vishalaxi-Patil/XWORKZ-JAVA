package com.xworkz.backery;

import com.xworkz.Browser.Browser;
import com.xworkz.Browser.Firefox;

public class FireFoxTester {

	public static void main(String[] args) {
		Object object = new Firefox();
		Browser browser = new Firefox();//parent,super,top,base ref=new child,extended,derived,inherited,sub
		Firefox firefox = new Firefox();
		System.out.println(firefox.getVersion());
		firefox.setVersion("3.5");
		System.out.println(firefox.getVersion());
		
		
		// below is not object
		// Firefox firefox2=new Browser();//illeagal becuase converting from child to
		// parent class
		// Browser browser2=new Object();
		if (object instanceof Firefox)// instanceof is used to avoid ClassCastException
		{
			System.out.println("Yes it is FireBox");
		} else {
			System.out.println("its not a instance of the fireBox");
		}
		object = new String("test");
		//instance is ued to check wheter ref is class type or sub type,this work only with inheritance
		if (object instanceof Firefox) {
			System.out.println("Yes it is FireBox");
		} else {
			System.out.println("its not a instance of the fireBox");
		}

		//Browser = new String("test");// it is not possible beacuse parent of the String is obect ,browser is the
										// child so,is is not possible to convert child to parent

	}

}
