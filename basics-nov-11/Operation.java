package com.xworkz.basics;

public class Operation {

	public static void main(String[] args) {
		// create String using literal
		//Str1 and str2 are reference varibale pointing to the same litral
		String str1="Hello";
		String str2="Hello";
		//we are not comparing content i.e Hello
		//we are comparing hashcodes in str1 and str2 which will be same for the String Hello
		if(str1==str2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		//create string using new keyword
		//str3 and str4 are reference variable which are pointing to 2 different object whose content is some
		String str3=new String("Hello");
		String str4=new String("Hello");
		if(str3==str4)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		//how should we compae two string i.e content
		if(str3.equals(str4))
		{
			System.out.println("str3 is equal to str4");
		}
		else
		{
			System.out.println("str3 is not equal to str4");
		}
		if(str3.compareTo(str4)==0)
		{
			System.out.println("str3 is compare to str4");
		}
		else {
			System.out.println("str3 is not compare to str4");
		}
		String str="vish,vishalxi,shushma,vidya,kallanagouda";
		System.out.println("str is::" +str);
		int len=str.length();
		System.out.println("length of str::" +len);
		System.out.println(str.charAt(0) +"|"+str.charAt(6));
		
		String upper=str.toUpperCase();
		System.out.println("str after upper case is" +upper);
		if(str.contains("VIDYA"
				+ ""))
		{
			System.out.println("vidya is present");
		}else {
			System.out.println("vidya is not present");
		}
	}

}
