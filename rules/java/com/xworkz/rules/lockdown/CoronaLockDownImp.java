package com.xworkz.rules.lockdown;

public class CoronaLockDownImp implements CoronaLockDown{
	@Override
	public int socialDistance() {
		System.out.println("Ivoked socialDistance");
		return 6;
	}
	@Override
	public void wearMask() {
		System.out.println("Invoked wearMask");
		
	}
	@Override
	public String sanitizer() {
		System.out.println("Invoked sanitizer");
		return "Santoor";
	}

}
