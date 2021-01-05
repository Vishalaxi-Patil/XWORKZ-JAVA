package com.xworkz.rules;

import com.xworkz.rules.lockdown.CoronaLockDown;
import com.xworkz.rules.lockdown.CoronaLockDownImp;

public class CoronaTester {

	public static void main(String[] args) {
		CoronaLockDown coronaLockDown=new CoronaLockDownImp();
		coronaLockDown.socialDistance();
		coronaLockDown.sanitizer();
		coronaLockDown.wearMask();
		String imp=coronaLockDown.country;
		System.out.println(imp);
	}

}
