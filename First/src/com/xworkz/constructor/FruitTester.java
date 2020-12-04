package com.xworkz.constructor;
import com.xworkz.constructor.decfrst.Fruit;

public class FruitTester {

	public static void main(String[] args) {
	new Fruit();
	Fruit fruit=new Fruit("Apple",100);
	String fruitname=fruit.name;
	System.out.println(fruitname);
	double fruitPrice=fruit.price;
	System.out.println(fruitPrice);
		

	}

}
