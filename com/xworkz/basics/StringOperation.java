package com.xworkz.basics;

public class StringOperation {

	public static void main(String[] args) {
		System.out.println("JVM invoked main");
		String str="vish ";
		System.out.println(str);
		String str1="vish";
		System.out.println(str1);
        str="patil";
		System.out.println(str);
		String totalStr=str1+str;
		System.out.println(totalStr);
		System.out.println("total length::" +totalStr.length());
		System.out.println(totalStr);
		System.out.println(str1.concat(str));
		System.out.println(totalStr.toUpperCase());
		System.out.println(totalStr);
		System.out.println(totalStr.toLowerCase());
		System.out.println(totalStr.charAt(6));
		System.out.println(totalStr.substring(3));
		boolean val=totalStr.equals(str1);
		System.out.println(val);
		boolean val1=str.equals(str1);
		System.out.println(val1);
		System.out.println(totalStr);
		
		totalStr="ABCD";
		System.out.println(totalStr);
		int a=10;
		System.out.println(a);
		System.out.println(a);
		a=20;
		System.out.println(a);
		System.out.println(a);
		String c=null;
		System.out.println(c);
		String name=" ";
		System.out.println(name.isEmpty());
	

}
	
}