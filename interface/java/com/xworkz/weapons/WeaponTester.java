package com.xworkz.weapons;

import com.xworkz.weapons.implementation.Ak47;
import com.xworkz.weapons.implementation.MachineGunWeapon;
import com.xworkz.weapons.implementation.MissleBrahmosWeapon;
import com.xworkz.weapons.weapon.BrahmosWeapon;
import com.xworkz.weapons.weapon.GunWeapon;
import com.xworkz.weapons.weapon.Weapon;

public class WeaponTester {

	public static void main(String[] args) {
		MachineGunWeapon gunWeapon=new MachineGunWeapon();
        
		gunWeapon.absort();
		gunWeapon.damage();
		gunWeapon.setNoOfBullets(3);
		String name=Weapon.country;
		System.out.println(name);
		String string=gunWeapon.toString();
		System.out.println(string);
		
		MachineGunWeapon gunWeapon1=new MachineGunWeapon();
	    gunWeapon1.setNoOfBullets(3);
		boolean equals=gunWeapon.equals(gunWeapon1);
		System.out.println(equals);
		
		System.out.println("******************************");
		
		BrahmosWeapon brahmosWeapon=new MissleBrahmosWeapon();
		MissleBrahmosWeapon cast=(MissleBrahmosWeapon)brahmosWeapon;
		cast.dontKnow();
		String string2=MissleBrahmosWeapon.country;
		System.out.println(string2);
	    cast.setRange(10);
	    
	    MachineGunWeapon weapon=new Ak47();
	    weapon.absort();
	    weapon.damage();
	    weapon.trigger();
	    
		
		

	}

}
