package com.xworkz.weapons.implementation;

import com.xworkz.weapons.weapon.GunWeapon;

public class MachineGunWeapon implements GunWeapon{
	
	private int noOfBullets;

	public int getNoOfBullets() {
		return noOfBullets;
	}

	public void setNoOfBullets(int noOfBullets) {
		this.noOfBullets = noOfBullets;
	}

	@Override
	public void damage() {
		System.out.println("Invoked damage");
		
	}

	@Override
	public void absort() {
		System.out.println("Invoked absort");
		
	}

	@Override
	public void trigger() {
		System.out.println("Invoked trigger");
		
	}

	@Override
	public String toString() {
		return "MachineGunWeapon [noOfBullets=" + noOfBullets + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode");
		return 45;
	}
	@Override
	public boolean equals(Object obj) {
		  System.out.println("Overide equals");
		  if(obj!=null) {
			  System.out.println("Obj is not null");
			  if(this==obj) {
				  System.out.println("two obj is pointing to same object");
				  return true;
			  }else {
				  if(obj instanceof MachineGunWeapon) {
					  MachineGunWeapon cast=(MachineGunWeapon)obj;
					  if(cast.getNoOfBullets()>0 && cast.getNoOfBullets()==this.noOfBullets) {
						  System.out.println("noOfBullets are equal");
						  return true;
					  }else {
						  System.out.println("noOfBullets are not equal");
					  }
				  }
			  }
		  }else {
		  System.out.println("obj is null");
		  return false;


	}
		return false;
	}
	
	
	
	

}
