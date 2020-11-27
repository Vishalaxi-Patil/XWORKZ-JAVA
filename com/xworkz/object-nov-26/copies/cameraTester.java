package com.xworkz.copies;
import com.xworkz.copies.object.Camera;

public class cameraTester {

	public static void main(String[] args) {
		Camera camera1=new Camera();
		Camera camera3=new Camera();
		camera3.price=2500;
		System.out.println("Camera price::"+camera3.price);
		camera1.price=2000;
		System.out.println("camera price after::" +camera3.price);
		Camera camera2=new Camera();
		camera2.type="lenevo";
		
		System.out.println("Camera type::" +camera2.type);
		camera1.type="Kodak";
		
		System.out.println("Camera type after::"+camera1.type);
		
	}
}
