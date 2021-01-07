package com.xworkz.weapons.implementation;

import com.xworkz.weapons.weapon.BrahmosWeapon;

public class MissleBrahmosWeapon implements BrahmosWeapon,Cloneable{
	
	private int range;
	

	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	@Override
	public void dontKnow() {
		System.out.println("Invoked dontKnow");
		
	}


	@Override
	public String toString() {
		return "MissleBrahmosWeapon [range=" + range + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode");
		return 22;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Overide equals");
		if(obj!=null) {
			System.out.println("obj is not null");
			if(this==obj) {
				System.out.println("two objects are pointing to same instance");
				return true;
			}else {
				if(obj instanceof MissleBrahmosWeapon) {
					MissleBrahmosWeapon cast=(MissleBrahmosWeapon)obj;
					if(cast.getRange()>0 && cast.getRange()==this.range) {
						System.out.println("range is equal");
						return true;
					}else {
						System.out.println("range is not equal");
					}
					
				}
			}
		}
		System.out.println("obj is null");
		return false;
	}
	@Override
	public  MissleBrahmosWeapon clone() throws CloneNotSupportedException {
		
		return (MissleBrahmosWeapon)super.clone();
	}
	
	public void createdExceptionalEvent(boolean create)throws Throwable{
		System.out.println("Invoked createdExceptionalEvent");
		if(create) {
			System.out.println("Created ExceptionalEvent");
			Throwable throwable=new Throwable();
			throw throwable;
		}else {
			System.out.println("no Event created");
		}
	}
   
	

}
