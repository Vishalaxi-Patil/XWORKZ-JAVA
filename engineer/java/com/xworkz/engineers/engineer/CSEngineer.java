package com.xworkz.engineers.engineer;

import com.xworkz.engineers.engineer.constants.Branch;

public class CSEngineer extends Engineer {
	private Branch branch = Branch.CS;

	public void problemSolving() {
		super.problemSolving();// super will used display method information in parent class
		System.out.println("Problem solved by CS");
	}
	
    
	/*public final void bunking(String name) // this method is final so we can overload but we cant overide it
	{
		System.out.println(" CS Engineer bunking");
	}*/

	/*public final void bunking() //overiding not possible beacuse this method is final
	{
		System.out.println(" CS Engineer bunking");
	}*/

	public Branch getBranch() {
		return super.getBranch();
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
}
