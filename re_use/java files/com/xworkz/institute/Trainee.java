package com.xworkz.institute;

import com.xworkz.institute.constants.TechicalStack;

public class Trainee {
	private String role;
	private String instituteName;
	private TechicalStack techicalStack;
	
	public void recruit()
	{
		System.out.println("Depending upon his/her Skill ,they will get placed");
	}
	public void trainer()
	{
		System.out.println("There is more to being a trainer than just being an entertrainer!");
	}
	
	public String getRole()
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role=role;
	}
	

	public String getInstituteName()
	{
		return instituteName;
	}
	public void setInstituteName(String instituteName)
	{
		this.instituteName=instituteName;
		
	}

	public TechicalStack getTechicalStack() {
		return techicalStack;
	}

	public void setTechicalStack(TechicalStack techicalStack) {
		this.techicalStack = techicalStack;
	}
	
}