package com.xworkz.copies;
import com.xworkz.copies.object.Speaker;
public class SpeakerTester {

	public static void main(String[] args) {
		speakerMethod();

	}
	public static void speakerMethod()
	{
		Speaker speaker1=new Speaker();
		System.out.println(speaker1.type);
		System.out.println(speaker1.brand);
		System.out.println(speaker1.companyName);


	}

}
