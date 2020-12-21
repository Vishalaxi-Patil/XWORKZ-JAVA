package com.xworkz.institute;

import com.xworkz.institute.constants.TechicalStack;

public class IntituteTester {

	public static void main(String[] args) {
		Trainee trainee=new Trainee();
		trainee.setRole("Software Trainee");
		trainee.setInstituteName("Xworkz");
		trainee.setTechicalStack(TechicalStack.ADVANCE);
		System.out.println("role::"+trainee.getRole());
		System.out.println("intitute name::"+trainee.getInstituteName());
		System.out.println("taking training on::"+trainee.getTechicalStack());
		trainee.recruit();
		System.out.println("*********************************");
		InstituteTrainee instituteTrainee=new InstituteTrainee();
		instituteTrainee.setRole("Trainer");
		instituteTrainee.setInstituteName("X-workz");
		instituteTrainee.setTechicalStack(TechicalStack.CORE);
		System.out.println("role::"+instituteTrainee.getRole());
		System.out.println("institute name::"+instituteTrainee.getInstituteName());
		System.out.println("Trainer on::"+instituteTrainee.getTechicalStack());
		instituteTrainee.trainer();
		System.out.println("*********************************");
		System.out.println(instituteTrainee.isOnline());
		instituteTrainee.setOnline(true);
		System.out.println(instituteTrainee.isOnline());
		
		
		
		
	}

}
