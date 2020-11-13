package com.xworkz.online;

public class BusSearch {
	private static String[] places = { "Kundgol", "Gadag", "Haveri", "Banglore", "Dhanvangeri",
			"Kuradgi", "Navalgund","Betgeri" };
	public static void search(String place)
	{
		System.out.println("Invoked search");
		System.out.println("arg 1::" +place);
		System.out.println("size of the array::"+places.length);
		boolean itemFound=false;
		for(int count=0;count<places.length;count++)
		{
			String value=places[count];
			if (value.equals(place))
			{
				itemFound=true;
				break;
			}else {
				itemFound=false;
			}
		}
			if(itemFound)
			{
				System.out.println("item found");
			}else {
				  System.out.println("iten not found");
				
			}
		
		System.out.println("Exit::search");
		
		
	}
	public static int totalPlaces()
	{
		return places.length;
	}

}
