package com.xworkz.engineers.engineer;

import com.xworkz.engineers.engineer.constants.Branch;
/*
 * Craeting class for declaring usn and intilaizing branch
 */
public  class Engineer {
	private String usn;
	private Branch branch=Branch.Mech;
	public String getUsn() {
		return usn;
	}
	/*
	 * creating method called problemSolving()
	 */
	public void problemSolving()
	{
		System.out.println("************************");
		System.out.println("problem solved by MECH");
	}
	public final void bunking()
    {
 	   System.out.println("Mech Engineer bunking");
    }
	
	
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	

}
