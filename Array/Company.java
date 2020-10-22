public class Company
{
	public static void main(String[] mnc)
	{
		System.out.println("JVM invoked main method");
		String[] companyArray={"Infosys","Congnizant","Tcs","Capgemini","Mindtree","Wipro","Accenture"};
		topMncCompanies(companyArray);
		topMncCompanies(null);
		System.out.println("exit of main method");
		
		
	
	}
	public static void topMncCompanies(String[] names)
	{
		System.out.println(" name of mnc companies" +names);
		int sizeOfArray=names.length;
		System.out.println("total length of array" +sizeOfArray);
		System.out.println("Name of mnc company at index 1=" +names[1]);
		System.out.println("Name of mnc comany at index  5=" +names[5]);
		System.out.println("Name of all mnc comapnies" +names[0]+ names[1]+names[2]+names[3]+names[4]+names[5]+names[6]);
	}
	}

		