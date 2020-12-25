package com.xworkz.backery;
import com.xworkz.backery.cake.Cake;
import com.xworkz.backery.cake.HoneyCake;
import com.xworkz.backery.cake.ChocklateHoneyCake;
public class CakeTester {

	public static void main(String[] args) {
       Cake cake=new Cake();
       cake.setFlavaour("Chocklate");
       cake.setSize(2.4);
       cake.setShape("Round");
       System.out.println(cake.getFlavaour());
       System.out.println(cake.getShape());
       System.out.println(cake.getSize());
       System.out.println("******************************");
       cake.baking();
       System.out.println("******************************");
       HoneyCake honeyCake=new HoneyCake();
       System.out.println(honeyCake.getFlavaour());
       System.out.println(honeyCake.getShape());
       System.out.println(honeyCake.getSize());
       honeyCake.setFlavaour("Vanila");
       System.out.println(honeyCake.getFlavaour());
       System.out.println("******************************");
       honeyCake.baking();
       System.out.println("******************************");
       ChocklateHoneyCake chocklateHoneyCake=new ChocklateHoneyCake();
       System.out.println(chocklateHoneyCake.getFlavaour());
       System.out.println(chocklateHoneyCake.getShape());
       System.out.println(chocklateHoneyCake.getSize());
       System.out.println("******************************");
       chocklateHoneyCake.baking();
       System.out.println("******************************");
       int hashCode=cake.hashCode();
       System.out.println(hashCode);
       boolean equals=cake.equals(honeyCake);
       System.out.println(equals);
       //cake.notify();
       String toString=cake.toString();
       System.out.println(toString);
       System.out.println("******************************");
       System.out.println(honeyCake.isHoney());
       chocklateHoneyCake.setHoney(true);
       System.out.println(chocklateHoneyCake.isHoney());
       
       
       
	}
	

}
