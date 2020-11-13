package com.xworkz.online;

public class Amazon {
	private static String[] items = { "watch", "mobile", "headphones", "sun glasses", "bluetooth", "mirror",
			"groceries", "dress", "iron box", "bags" };

	public static void search(String itemName) {
		System.out.println("Invoked serach");
		System.out.println("arg1::" + itemName);
		System.out.println("size of an array::" + items.length);
		boolean itemFound = false;
		for (int count = 0; count < items.length; count++) {
			String item = items[count];
			if (item.equals(itemName)) {
				itemFound = true;
				break;
			} else {
				itemFound = false;
			}

		}
		if (itemFound) {
			System.out.println("Item is found");
		} else {
			System.out.println("item is not found");
		}
		System.out.println("Exit::serach");

	}
	public static int getItems() {
		return items.length;
	}
}
