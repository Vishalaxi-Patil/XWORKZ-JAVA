package com.xworkz.online;

public class HotelMenuSearch {
	private static String[] search= {"Jeera rice","Masala rice","Alu masala","Butter naan","Butter roti","Gobi"};
	public static void search(String foodName,byte price)
	{
		System.out.println("Invoked search");
		System.out.println("orderd food name::" +foodName);
		System.out.println("price of ordered food::" +price);
		System.out.println("Size of an array::" +search.length);
		boolean foodFound=false;
		for(int count=0;count<search.length;count++)
		{
			String val=search[count];
			if(val.equals(foodName))
			{
				foodFound=true;
			}else {
				foodFound=false;
			}
		}
		if(foodFound)
		{
			System.out.println("orderedfood is found");
		}
		else {
			System.out.println("ordered food not found");
		}
		System.out.println("Exit::main");
	}
	public static int totalSearch()
	{
		return search.length;
	}
	

}
