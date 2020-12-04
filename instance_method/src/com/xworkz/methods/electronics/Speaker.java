package com.xworkz.methods.electronics;

public class Speaker {
	private int batteryBackupInHours;
	private String companyName="JBL";
	private String color;
	private boolean connected;
	private int maxVolumeLevel=4;
	private int minVolumeLevel=0;
	private int currentValueLevel=0;
	
	
	public Speaker(int batteryBackupInHours,String color)
	{
		System.out.println("speaker contructor is called");
		this.batteryBackupInHours=batteryBackupInHours;
		this.color=color;
		System.out.println("arg 1::" +batteryBackupInHours);
		System.out.println("arg 2::" +color);
		System.out.println("Speaker constructor complted its excuation");
	}
	public void onOrOff()
	{
		System.out.println("onOrOff metod is called");
		if(this.connected==false)
		{
			this.connected=true;
			System.out.println("Speaker is on");
			return;
		}else if(this.connected=true)
		{
			this.connected=false;
			System.out.println("Speaker is off");
		}
		System.out.println("onOrOff method is completed");
	}
	public void increaseVolume()
	{
		System.out.println("incerease valume method is called");
		if(this.connected==true)
		{
			System.out.println("speaker is on");
			if(this.currentValueLevel<this.maxVolumeLevel)
			{
				this.currentValueLevel=this.currentValueLevel+1;
				System.out.println("current valolume::" +this.currentValueLevel);
			}else
			{
				System.out.println("max volume reached");
			}
				
		}else
		{
			System.out.println("speaker is off");
		}
		System.out.println(("increaseVolumeLevel method is completed"));
	}
	public void decreaseVolumeLevel()
	{
		System.out.println("Decrease volume level is called");
		if(this.connected==true)
		{
			System.out.println("Speaker is on");
			if(this.maxVolumeLevel>minVolumeLevel)
			{
				this.maxVolumeLevel=this.maxVolumeLevel-1;
				System.out.println("Maximun volume::" +this.maxVolumeLevel);
			}else
			{
				System.out.println(("min volume is reached"));
			}
		}else
		{
			System.out.println("Speaker is off");
		}
		System.out.println("Decrease volume method is complted");
	}
	public int getBatteryBackupInHours() {
		return batteryBackupInHours;
	}
	public String getColor() {
		return color;
	}
	public String getCompanyName() {
		return companyName;
	}
		
	
}
	
