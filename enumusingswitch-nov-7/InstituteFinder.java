public class InstituteFinder
{
	public static String lowestAndBestUsingString(String instituteName)
	{
		System.out.println("Invoked lowestAndBestUsingString");
		System.out.println("giving instiute name at run time::" +instituteName);
		switch(instituteName)
		{
			case "Xworkz":
			System.out.println("case is::" +instituteName);
			System.out.println("Enterprise Development ");
			System.out.println("cost is 20k");
			break;
			
			case "Qspider":
			System.out.println("case is::" +instituteName);
			System.out.println("Java and j2ee");
			System.out.println("32000");
			break;
			
			case "ABC":
			System.out.println("case is::" +instituteName);
			System.out.println("java");
			System.out.println("cost is 30k");
			break;
			
			case "Soc expert":
			System.out.println("case is::" +instituteName);
			System.out.println("Cyber Security");
			System.out.println("cost is 40k");
			
			default:
			System.out.println("No institute mathed");
		}
		System.out.println("Exit::lowestAndBestUsingString");
		return instituteName;
		
		
	}
	public static void lowestAndBestUsingEnum(Institute instituteName)
	{
		System.out.println("Invoked lowestAndBestUsingEnum");
		System.out.println("cmd line argument::" +instituteName);
		switch(instituteName)
		{
			 case XWORKZ:
			  System.out.println("case is::" +instituteName);
			  System.out.println("Enterprise Development ");
			  System.out.println("cost is 20k");
			break;
			
			case ABC:
			  System.out.println("case is::" +instituteName);
			  System.out.println("java");
			  System.out.println("cost is 30k");
			break;
			
			case SOCEXPERT:
			System.out.println("case is::" +instituteName);
			System.out.println("Cyber Security");
			System.out.println("cost is 40k");
			
	
			  
			
			 
		}
		System.out.println("Exit::lowestAndBestUsingEnum");
	}
}