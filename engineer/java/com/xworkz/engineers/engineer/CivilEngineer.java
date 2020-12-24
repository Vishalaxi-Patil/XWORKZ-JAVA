package com.xworkz.engineers.engineer;

import com.xworkz.engineers.engineer.constants.Branch;

public class CivilEngineer extends Engineer{
	private Branch branch=Branch.CIVIL;
	
	public void Construction()
	{
		System.out.println("********************");
		System.out.println("Civil engineering construct building");
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
	
	

}
