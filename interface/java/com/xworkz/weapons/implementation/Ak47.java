package com.xworkz.weapons.implementation;

public class Ak47 extends MachineGunWeapon{
	@Override
	public void trigger() {
		 System.out.println("ovride trigeer in Ak47");
		super.trigger();
	}

}
