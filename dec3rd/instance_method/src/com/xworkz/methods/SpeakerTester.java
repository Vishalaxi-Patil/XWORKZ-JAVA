package com.xworkz.methods;
import com.xworkz.methods.electronics.Speaker;

import com.xworkz.methods.electronics.Speaker;

public class SpeakerTester {

	public static void main(String[] args) {
		Speaker speaker=new Speaker(6,"Yellow");
		System.out.println(speaker.getBatteryBackupInHours());
		System.out.println(speaker.getColor());
		System.out.println(speaker.getCompanyName());
		speaker.onOrOff();
		speaker.onOrOff();
		speaker.onOrOff();
		//speaker.onOrOff();

		
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.decreaseVolumeLevel();
		speaker.decreaseVolumeLevel();
		speaker.decreaseVolumeLevel();
		speaker.decreaseVolumeLevel();
		speaker.decreaseVolumeLevel();

		
		

		
		



	}

}

