package com.xworkz.online;

public class PhoneDirectory {
	private static long[] phoneNumbers = { 7869657453L, 9807867554L, 7867676758L, 6778900998L, 5657688990L, 7878786958L,
			8989898978L, 6767687990L, 6767798089L, 909988775656L };
	public static void searchNumber(long number)
	{
		System.out.println("Invoked searchNumber");
		System.out.println("arg 1::" +number);
		System.out.println("size of array::" +phoneNumbers.length);
		boolean itemFound=false;
		for(int count=0;count<phoneNumbers.length;count++)
		{
			long value=phoneNumbers[count];
			if(value==number)
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
			System.out.println("item not found");
		}
		System.out.println("Exit::main");
	}
      public static int totalPhoneNumbers()
      {
    	  return phoneNumbers.length;
      }

}
