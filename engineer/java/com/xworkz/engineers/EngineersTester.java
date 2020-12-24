package com.xworkz.engineers;

import com.xworkz.engineers.engineer.CSEngineer;
import com.xworkz.engineers.engineer.CivilEngineer;
import com.xworkz.engineers.engineer.EEEEngineer;
import com.xworkz.engineers.engineer.Engineer;
import com.xworkz.engineers.engineer.ITCSEngineer;

public class EngineersTester {
	
	public static void main(String[] args) {
		Engineer engineer=new Engineer();
		engineer.problemSolving();
		System.out.println(engineer.getBranch());
		Engineer engineer2=new CSEngineer();
		engineer2.problemSolving();
		System.out.println(engineer2.getBranch());
		
		CSEngineer csEngineer=(CSEngineer)engineer2;
		csEngineer.problemSolving();
		System.out.println(csEngineer.getBranch());
		
		Engineer engineer3=new CSEngineer();
		Engineer engineer4=new ITCSEngineer();
		engineer3.problemSolving();
		System.out.println(engineer3.getBranch());
		engineer4.problemSolving();
		System.out.println(engineer4.getBranch());
		
		Engineer engineer5=new CivilEngineer();
		//engineer5.problemSolving();
		CivilEngineer civilEngineer=(CivilEngineer)engineer5;
		civilEngineer.Construction();
		System.out.println(civilEngineer.getBranch());
		
		
		Engineer engineer6=new EEEEngineer();
		EEEEngineer eeeEngineer=(EEEEngineer)engineer6;
		eeeEngineer.powerGenerate();
		System.out.println(eeeEngineer.getBranch());
		
		System.out.println(eeeEngineer.getParentBranch());
		
		
		
		
		
		

		
		
       
	}

}
